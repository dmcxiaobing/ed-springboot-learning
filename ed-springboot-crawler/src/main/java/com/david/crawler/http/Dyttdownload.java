package com.david.crawler.http;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.david.crawler.entity.DyUrl;
import com.david.crawler.utils.JdbcUtils;

/**
 * 电影天堂 电影下载地址爬取
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Dyttdownload {
	static int id = 1;
	public static HttpClient client = null;

	public static void main(String[] args) {
		// ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
		Map<Integer, String> map = new HashMap<>();
		for (int i = 1; i < 50; i++) {
			// http://www.ygdy8.net/html/gndy/dyzz/list_23_2.html
			map.put(i, "http://www.ygdy8.net/html/gndy/dyzz/list_23_" + i + ".html");
		}
		for (String string : map.values()) {
			getUrl(string);
			// Thread.currentThread().sleep(2000);

		}

		// getDownloadUrl("http://www.ygdy8.net/html/gndy/dyzz/20170926/55094.html");
	}

	public static void getUrl(String uri) {

		try {
			client = HttpClients.createDefault();
			// RequestConfig config=RequestConfig.custom().setProxy(new
			// HttpHost("110.73.14.161",8123)).build();
			HttpGet get = new HttpGet(uri);
			// get.setConfig(config);
			HttpResponse response = client.execute(get);
			String result = EntityUtils.toString(response.getEntity(), "gb2312");
			Document doc = Jsoup.parse(result);
			// css选择器。。。table 标签，class名称。
			Elements elements = doc.select("table.tbspan ");
			for (Element element : elements) {
				element.setBaseUri("http://www.ygdy8.net");
				// 获取tr标签中的，第一个td.然后根据td中的标签获取a标签内容。
				DyUrl dy = getDownloadUrl(element.select("tr").get(1).select("a").text(),
						// 获取到超链接。
						element.select("tr").get(1).select("a").attr("abs:href"));
				// 得到电影entity，然后插入到数据库。
				dy.setId(id);
				// utils.insert(dy);
				insertDb(dy);
				id++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 将数据插入到数据库。
	 */
	private static void insertDb(DyUrl dy) {
		// 添加批处理，这一组参数就保存到集合中了。
		try {
			Connection connection = JdbcUtils.getConnection();
			/**
			 * INSERT INTO 表名称 VALUES (值1, 值2,....)
				我们也可以指定所要插入数据的列：
				INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
			 */
			String sql = "insert into tb_dyttvideo (name,dyurl) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setInt(1, dy.getId());
			preparedStatement.setString(1, dy.getName());
			preparedStatement.setString(2, dy.getDyurl());
			preparedStatement.addBatch();
//			long start = System.currentTimeMillis();
			preparedStatement.execute();// 执行批处理
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static DyUrl getDownloadUrl(String name, String dyurl) {
		DyUrl dy = new DyUrl();
		// RequestConfig config=RequestConfig.custom().setProxy(new
		// HttpHost("110.73.14.161",8123)).build();
		try {
			client = HttpClients.createDefault();
			HttpGet get = new HttpGet(dyurl);
			// get.setConfig(config);
			HttpResponse response = client.execute(get);
			String result = EntityUtils.toString(response.getEntity(), "gb2312");
			Document doc = Jsoup.parse(result);
			Elements elements = doc.select("div#Zoom table tr td a ");
			dy.setName(name);
			dy.setDyurl(elements.get(0).text());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dy;
	}

}