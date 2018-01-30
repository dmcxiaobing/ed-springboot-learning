package com.david.crawler.http;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.david.crawler.utils.CharsetUtils;
import com.david.crawler.utils.JdbcUtils;



/**
 * 使用httpclient与jsoup结合爬取数据
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class HttpclientJsoup {

	/**
	 * 使用httpclient与jsoup结合爬取数据
	 */
	// @Test
	public void testHttpClinetJsoup() throws Exception {
		// 创建HttpClient对象
		HttpClient httpClient = new DefaultHttpClient();
		// 设置响应时间，读取源码时间。代理服务器等
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000)
				// .setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("dailiip"))
				.setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
		// 使用get请求，创建请求对象
		HttpGet httpGet = new HttpGet(DavidJsoup.URL);
		// 发送请求，获取响应数据
		HttpResponse response = httpClient.execute(httpGet);
		// 将网页实体转换成字符串
		String content = EntityUtils.toString(response.getEntity(), "UTF-8");

		// jsoup负责解析网页。
		Document document = Jsoup.parse(content);
		// 使用元素选择器获取网页内容
		// 根据标签名称，class名称。a标签，获取到超链接的地址和名字。。指定标签下的a
		Elements elements = document.select("tr.js-navigation-item a");
		// 循环遍历元素
		for (Element element : elements) {
			System.out.println(element.text() + ":" + element.attr("href"));
		}

	}

	/**
	 * 使用httpclient与jsoup结合爬取数据
	 */
	@Test
	public void testHttpClinetJsoupGov() throws Exception {
		// 创建HttpClient对象
		HttpClient httpClient = new DefaultHttpClient();
		// 设置响应时间，读取源码时间。代理服务器等
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000)
				// .setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("dailiip"))
				.setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
		// 使用get请求，创建请求对象
		HttpGet httpGet = new HttpGet("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2016/42/4202.html");
//		HttpGet httpGet = new HttpGet("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2016/12/1201.html");
		// 发送请求，获取响应数据
		HttpResponse response = httpClient.execute(httpGet);
		// 将网页实体转换成字符串
		String content = EntityUtils.toString(response.getEntity(), "gb2312");

//		String contentUtf8 = CharsetUtils.getGetMethodParameter(content);
		// jsoup负责解析网页。
		Document document = Jsoup.parse(content);
		// 使用元素选择器获取网页内容
		// 根据标签名称，class名称。a标签，获取到超链接的地址和名字。。指定标签下的a
		Elements elements = document.select("tr.countytr a");
		List<String> numbersList = new ArrayList<String>();
		List<String> StringList = new ArrayList<String>();
		// 循环遍历元素
		for (Element element : elements) {
			// System.err.println(element.text() + "");
			if (isNumber(element.text())) {
				numbersList.add(element.text());
			} else {
				StringList.add(element.text());
			}

		}
		for (int i = 0; i < numbersList.size(); i++) {
			fun2(numbersList, StringList,i);
		}
//		for (String string : numbersList) {
//			System.err.println(string);
//		}
		// 120101000000
		// 120102000000
		// 120103000000
		// 120104000000
		// 120105000000
		// 120106000000
		// 120110000000
		// 120111000000
		// 120112000000
		// 120113000000
		// 120114000000
		// 120115000000
		// 120116000000
		// 120117000000
		// 120118000000
		// 120119000000

		// 南开区
		// 河北区
		// 红桥区
		// 东丽区
		// 西青区
		// 津南区
		// 北辰区
		// 武清区
		// 宝坻区
		// 滨海新区
		// 宁河区
		// 静海区
		// 蓟州区
		// for (String string : StringList) {
		// System.err.println(string);
		// }

		//
	}

	// 规范化 执行 查询操作
	public void fun2(List<String> numbers,List<String> names,int i) throws Exception {
		Connection connection = JdbcUtils.getConnection();
		String sql = "insert into tb_city values(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
//		for (int i = 0; i < numbers.size(); i++) {
			preparedStatement.setString(1,names.get(i));
			preparedStatement.setString(2, numbers.get(i));
			// 添加批处理，这一组参数就保存到集合中了。
			preparedStatement.addBatch();
//		}
		long start = System.currentTimeMillis();
		preparedStatement.execute();// 执行批处理
		System.out.println("操作成功");
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);

	}

	public static boolean isHanZi(char ch) {
		// 判断是否汉字
		return (ch >= 0x4E00 && ch <= 0x9FA5);
	}

	public static boolean isNumber(String str) {
		// 判断是否纯数字
		boolean result = str.matches("[0-9]+");
		return result;
	}
}
