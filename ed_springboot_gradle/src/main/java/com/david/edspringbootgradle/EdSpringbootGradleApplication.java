package com.david.edspringbootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class EdSpringbootGradleApplication {
	/**
	 * 	http://localhost:8083
		user: admin , pass: admin
		API调试
		http://localhost:8083/swagger-ui.html
	 */
	public static void main(String[] args) {
		SpringApplication.run(EdSpringbootGradleApplication.class, args);
	}
	

}
