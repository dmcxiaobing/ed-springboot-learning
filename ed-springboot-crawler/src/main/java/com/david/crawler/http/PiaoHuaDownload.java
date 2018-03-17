package com.david.crawler.http;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.david.crawler.constants.Constants;
import com.david.crawler.entity.DyUrl;
import com.david.crawler.utils.JdbcUtils;
import com.mchange.lang.StringUtils;

/**
 * 飘花电影下载地址爬取
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class PiaoHuaDownload {
	static int id =1;
	public static HttpClient client = null;

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		// 执行52次
		for (int i = 1; i < 50; i++) {
			map.put(i, Constants.PIAOHUA_VIDEO_URL + i + ".html");
		}
		// 正在爬这个https://www.piaohua.com/html/dongzuo/list_1.html网页
		for (String string : map.values()) {
			System.out.println("正在爬这个" + string + "网页");
			// TODO Auto-generated method stub
			getUrl(string);

		}

	}

	public static void getUrl(String uri) {
		try {
			client = HttpClientBuilder.create().build();
			HttpResponse response = client.execute(new HttpGet(uri));
			String result = EntityUtils.toString(response.getEntity(), "utf-8");
			Document doc = Jsoup.parse(result);
			doc.setBaseUri("http://www.piaohua.com");
			Elements elements = doc.select("#list dl");
			// 这样是爬取左侧的列表，这样翻页不会发生变化，所以要爬取内容的数据
//			Elements elements = doc.select("div.list a");
			for (Element element : elements) {
				String name;
				if (element.select("font")==null||element.select("font").first()==null||element.select("font").first().text()==null) {
					// 获取整个在超链接中的标签内容
					name = element.text()+":"+element.attr("href");
				}else {
					// font标签，获取视频名称
					name = element.select("font").first().text();
				}
				// 获取超链接
				String dyurl = element.select("a").first().absUrl("href");
				// 将详情url插入到数据库
//				insertDetailUrl(dyurl);
				DyUrl dy = getDownloadUrl(name, dyurl);
				dy.setId(id);
				// 插入到数据库
				if (dy==null||org.apache.commons.lang3.StringUtils.isEmpty(dy.getName())||org.apache.commons.lang3.StringUtils.isEmpty(dy.getDyurl())) {
					
				}else {
					insert(dy);
				}
				id++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 将视频详情页插入到数据库
	 */
	private static void insertDetailUrl(String dyurl) {
		// 添加批处理，这一组参数就保存到集合中了。
		try {
			Connection connection = JdbcUtils.getConnection();
			String sql = "insert into piaohua_detailurl values(?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dyurl);
			preparedStatement.addBatch();
//			long start = System.currentTimeMillis();
			preparedStatement.execute();// 执行批处理
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将下载地址插入到数据库
	 */
	private static void insert(DyUrl dy) {
		// 添加批处理，这一组参数就保存到集合中了。
		try {
			Connection connection = JdbcUtils.getConnection();
			/**
			 * INSERT INTO 表名称 VALUES (值1, 值2,....)
				我们也可以指定所要插入数据的列：
				INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
			 */
			String sql = "insert into tb_piaohuavideo (name,dyurl) values(?,?)";
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
		DyUrl dUrl = new DyUrl();
		try {
			client = HttpClients.createDefault();
			HttpResponse response;
			response = client.execute(new HttpGet(dyurl));
			String result = EntityUtils.toString(response.getEntity(), "utf-8");
			Document doc = Jsoup.parse(result);
			Elements elements = doc.select("#showinfo").select("a");
			dUrl.setName(name);
			dUrl.setDyurl(elements.first().text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dUrl;

	}
}