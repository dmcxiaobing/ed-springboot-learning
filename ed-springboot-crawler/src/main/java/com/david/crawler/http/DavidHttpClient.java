package com.david.crawler.http;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SuppressWarnings("deprecation")
public class DavidHttpClient {

	/**
	 * HttpClient爬取网页数据。
	 * @throws InterruptedException 
	 */
	@Test
	public void testHttpclient() throws IOException, ClientProtocolException, InterruptedException {
		while (true) {
		
			HttpClient httpClient = new DefaultHttpClient();
			// 设置响应时间，读取源码时间。代理服务器等
			httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000)
			//.setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("dailiip"))
			.setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
			// 使用get请求，创建请求对象
			HttpGet httpGet = new HttpGet("https://blog.csdn.net/huangyuhuangyu/article/details/80011683");
			// 发送请求，获取响应数据
			HttpResponse response = httpClient.execute(httpGet);
			// 将网页实体转换成字符串
			String content = EntityUtils.toString(response.getEntity(),"UTF-8");
			System.out.println(content);
			Thread.sleep(2000);
		}
	}
}
