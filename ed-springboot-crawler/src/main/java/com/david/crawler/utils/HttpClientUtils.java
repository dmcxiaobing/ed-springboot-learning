package com.david.crawler.utils;

/**
 * david
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */

import java.net.URLDecoder;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

//Http请求的工具类 这里使用HttpClient封装
public class HttpClientUtils {

	public static void main(String[] args) {
		/**
		 * post请求测试
		 */
		try {
			doPostAsyn("http://127.0.0.1:8080/JavaWebBase/LoginActionServlet?", "username=admin&password=123456",
					new CallBack() {

						@Override
						public void onRequestComplete(String result) {
							// TODO Auto-generated method stub
							System.out.println("post:" + result);
						}
					});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// get请求测试。
		// get请求测试。
		doGetAsyn("http://127.0.0.1:8080/JavaWebBase/LoginActionServlet?username=admin&password=123456",
				new CallBack() {

					@Override
					public void onRequestComplete(String result) {
						System.out.println("get:" + result);
					}
				});

	}

	/**
	 * 异步的Get请求
	 * 
	 * @param urlStr
	 * @param callBack
	 */
	public static void doGetAsyn(final String urlStr, final CallBack callBack) {
		new Thread() {
			public void run() {
				try {
					String result = doGet(urlStr);
					if (callBack != null) {
						callBack.onRequestComplete(result);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}.start();
	}

	/**
	 * 接收返回的结果
	 *
	 */
	public interface CallBack {
		void onRequestComplete(String result);
	}

	/**
	 * 异步的Post请求
	 * 
	 * @param urlStr
	 * @param params
	 * @param callBack
	 * @throws Exception
	 */
	public static void doPostAsyn(final String urlStr, final String params, final CallBack callBack) throws Exception {
		new Thread() {
			public void run() {
				try {
					String result = doPost(urlStr, params);
					if (callBack != null) {
						callBack.onRequestComplete(result);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			};
		}.start();

	}

	protected static String doPost(String url, String params) {
		// post请求返回结果
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost method = new HttpPost(url+params);
		String str = "";
		try {
			HttpResponse result = httpClient.execute(method);
			url = URLDecoder.decode(url, "UTF-8");
			/** 请求发送成功，并得到响应 **/
			if (result.getStatusLine().getStatusCode() == 200) {
				/** 读取服务器返回过来的字符串数据 **/
				str = EntityUtils.toString(result.getEntity());

				return str;

			}
		} catch (Exception e) {
			System.out.println("post请求提交失败:" + url);
		}

		return str;

	}

	/**
	 * 异步的Get请求
	 * 
	 * @param url
	 *            请求的地址
	 * @return
	 */
	protected static String doGet(String url) {
		String json = "";
		DefaultHttpClient httpClient = new DefaultHttpClient();
		// url = URLDecoder.decode(url, "UTF-8");
		HttpGet httpGet = new HttpGet(url);
		try {
			HttpResponse httpResponse = httpClient.execute(httpGet);
			/** 请求发送成功，并得到响应 **/
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				/** 读取服务器返回过来的字符串数据 **/
				json = EntityUtils.toString(httpResponse.getEntity());
				return json;
			} else {
				System.out.println("get请求提交失败:" + url);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	};

}
