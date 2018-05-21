package com.david.crawler.thread;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.david.crawler.utils.HttpClientUtils;
import com.david.crawler.utils.HttpClientUtils.CallBack;

/**
 * 测试并发的多线程
 */
public class MytestMutliThread implements Runnable {
	Map<String, Object> postData = new HashMap<String, Object>();
	@Override
	public void run() {
		// 这里实现http请求
		String url = "http://localhost/sendMq";
		// System.out.println(postData.toString());
		HttpClientUtils.doGetAsyn(url, new CallBack() {

			@Override
			public void onRequestComplete(String result) {
				System.out.println("----返回结果-----" + result);
			}
		});
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(300);// 10是线程数
	
		for (int i = 0; i < 100; i++) {
			service.execute(new MytestMutliThread());// 并发50个用户
	
		}
	}

}
