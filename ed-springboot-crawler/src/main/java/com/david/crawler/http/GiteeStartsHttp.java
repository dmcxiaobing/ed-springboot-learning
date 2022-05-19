package com.david.crawler.http;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.david.crawler.utils.FileUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * gitee starts 代码地址爬取
 *
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class GiteeStartsHttp {
    public static HttpClient client = null;

    static String url = "https://gitee.com";

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
		for (int i = 1; i < 59; i++) {
//        for (int i = 1; i < 2; i++) {
            map.put(i, "https://gitee.com/MCXIAOBING/stared_projects?page=" + i);
        }
        for (String string : map.values()) {
            getUrl(string);
        }

    }

    public static void getUrl(String uri) {

        try {
            client = HttpClients.createDefault();
            HttpGet get = new HttpGet(uri);
            HttpResponse response = client.execute(get);
            String result = EntityUtils.toString(response.getEntity(), "gb2312");
            Document doc = Jsoup.parse(result);
            // css选择器。。。a 标签，class名称。
            Elements elements = doc.select("a.repository ");

            for (Element element : elements) {
                System.out.println(element.select("a"));
                // 获取tr标签中的，第一个td.然后根据td中的标签获取a标签内容。
                String href = element.select("a").attr("href");
                String title = element.select("a").text();
                System.out.println(title);
                System.out.println(href);
                String bat = "git clone --depth=1 " + url + href;
                FileUtil.fileLinesWrite("src/main/resources/cloneGitee.bat", bat, true);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}