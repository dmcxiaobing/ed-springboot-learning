package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 利用websocket做一个简单的群发聊天室
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
@Controller
public class WebSocketApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebSocketApplication.class, args);
	}

	/**
	 * 转发到index.ftl
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
