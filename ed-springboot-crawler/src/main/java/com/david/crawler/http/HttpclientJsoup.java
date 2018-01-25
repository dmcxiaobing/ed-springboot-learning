package com.david.crawler.http;

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

/**
 * 使用httpclient与jsoup结合爬取数据
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class HttpclientJsoup {

	/**
	 * 使用httpclient与jsoup结合爬取数据
	 */
	@Test
	public void testHttpClinetJsoup() throws Exception{
		// 创建HttpClient对象
		HttpClient httpClient = new DefaultHttpClient();
		// 设置响应时间，读取源码时间。代理服务器等
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000)
		//.setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("dailiip"))
		.setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
		// 使用get请求，创建请求对象
		HttpGet httpGet = new HttpGet(DavidJsoup.URL);
		// 发送请求，获取响应数据
		HttpResponse response = httpClient.execute(httpGet);
		// 将网页实体转换成字符串
		String content = EntityUtils.toString(response.getEntity(),"UTF-8");
		
		// jsoup负责解析网页。
		Document document = Jsoup.parse(content);
		// 使用元素选择器获取网页内容
		//根据标签名称，class名称。a标签，获取到超链接的地址和名字。。指定标签下的a
		Elements elements = document.select("tr.js-navigation-item a");
		// 循环遍历元素
		for (Element element : elements) {
			System.out.println(element.text()+":"+element.attr("href"));
		}
		
		
	}
}
