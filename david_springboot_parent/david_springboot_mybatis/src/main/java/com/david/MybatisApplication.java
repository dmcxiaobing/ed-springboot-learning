package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot与mybatis的结合
 * INSERT INTO message VALUES(1,'zhangsan','192.168.1.1','1983-11-23 00:00:00')
 * INSERT INTO message VALUES('zhangsan','192.168.1.1','1983-11-23 00:00:00')
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
}