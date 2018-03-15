package com.david.crawler.http;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
/**
 * post请求httpclient
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class DavidHttpPostRaw {
	/**
	 * 测试post
	 */
	public static void httpTest() throws ClientProtocolException, IOException {

		String url = "http://wx.diggid.cn/coverHttps.php?url=/V2/news/list.html?chid=0";
		// String str = "aid=1\ngid=10040\ncid=1000217"; // 这里把参数按照
		// key=value回车（aid=1\n）的方式组成一个字符串。
		String str = ""; // 这里把参数按照 key=value回车（aid=1\n）的方式组成一个字符串。

		HttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		StringEntity postingString = new StringEntity(str);
		post.setEntity(postingString);
		HttpResponse response = httpClient.execute(post);
		String content = EntityUtils.toString(response.getEntity());
		// Log.i("test",content);
		System.out.println(content);
	}

	public static void main(String[] args) throws Exception {
		httpTest();
	}
}
