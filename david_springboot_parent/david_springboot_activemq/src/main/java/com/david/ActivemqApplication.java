package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * activemq的使用介绍。http://127.0.0.1:8161
 * 
 * http://localhost:8161/admin
 * username：admin
 * password:admin
 * 这个用户名密码是在conf/users.properties中配置的
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class ActivemqApplication {
	public static void main(String[] args) {
		SpringApplication.run(ActivemqApplication.class, args);
	}
}
