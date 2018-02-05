package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * jpush发送短信的sdk的springboot版。官方文档介绍：http://docs.jiguang.cn/server/rest_api_jsms/
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class JpushApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(JpushApplication.class, args);
	}
}
