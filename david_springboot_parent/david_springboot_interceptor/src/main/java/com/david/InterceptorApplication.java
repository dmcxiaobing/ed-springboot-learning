package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Interceptor的介绍类
 * 
 * 	1、创建我们自己的拦截器类并实现 HandlerInterceptor 接口。 

	2、创建一个Java类继承WebMvcConfigurerAdapter，并重写 addInterceptors 方法。 
	
	3、实例化我们自定义的拦截器，然后将对像手动添加到拦截器链中（在addInterceptors方法中添加）。
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching
@EnableScheduling
@ComponentScan
public class InterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterceptorApplication.class, args);
	}
}
