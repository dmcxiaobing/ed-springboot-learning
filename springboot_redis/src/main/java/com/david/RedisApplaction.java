package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot-redis
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 * 
 */

@SpringBootApplication
@EnableAutoConfiguration
@RestController // @Controller @ResponseBody
@ComponentScan(basePackages={"com.david","com.david.manager.service","com.david.manager.service.impl","com.david.manager.web.controller","com.david.jedis"})
public class RedisApplaction extends SpringBootServletInitializer {
	public static void main(String[] args) {
		// 程序启动入口
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(RedisApplaction.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RedisApplaction.class);
	}

}
