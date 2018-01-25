package com.david.crawler.http;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * jsoup的简单爬取网页介绍。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class DavidJsoup {
	
	public static final String URL = "https://github.com/QQ986945193/ed-springboot-learning";
	
	/**
	 * 使用jsoup解析网页的源码
	 * 
	 */
	@Test
	public void testJsoup() throws Exception {
		// 使用jsoup向服务器发送请求
		Document document = Jsoup.connect(URL).get();
//		Elements elements = document.select("ul.nav_txt a");
		/**
			 * <tr class="js-navigation-item">
		          <td class="icon">
		            <svg aria-hidden="true" class="octicon octicon-file-directory" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M13 4H7V3c0-.66-.31-1-1-1H1c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h12c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1zM6 4H1V3h5v1z"/></svg>
		            <img alt="" class="spinner" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
		          </td>
		          <td class="content">
		            <span class="css-truncate css-truncate-target"><a href="/QQ986945193/ed-springboot-learning/tree/master/david_springboot_parent" class="js-navigation-open" id="f7fefbff374b3e0a186126b67162e865-5d85316e7a38b17d6fbf8da1f23706645624a2f0" title="david_springboot_parent">david_springboot_parent</a></span>
		          </td>
		          <td class="message">
		            <span class="css-truncate css-truncate-target">
		                  <a href="/QQ986945193/ed-springboot-learning/commit/f8aa068c111666f61c0fcf7e3a7b51c279667653" class="message" data-pjax="true" title="添加配置文件">添加配置文件</a>
		            </span>
		          </td>
		          <td class="age">
		            <span class="css-truncate css-truncate-target"><time-ago datetime="2018-01-24T09:05:46Z">Jan 24, 2018</time-ago></span>
		          </td>
		        </tr>
		 */
		// jsoup使用类型。css，jquery选择器方式获取元素节点..这里获取所有a标签的名内
//		Elements elements = document.getElementsByTag("a");
//		System.out.println(elements.text());
		
		
		//根据标签名称，class名称。a标签，获取到超链接的地址和名字。。指定标签下的a
		Elements elements = document.select("tr.js-navigation-item a");
		// 循环遍历元素
		for (Element element : elements) {
			System.out.println(element.text()+":"+element.attr("href"));
		}
		
		
	}
}
