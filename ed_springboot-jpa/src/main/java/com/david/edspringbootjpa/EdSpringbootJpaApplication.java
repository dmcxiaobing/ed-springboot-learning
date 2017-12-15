package com.david.edspringbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *  spring-boot-starter  //Spring Boot starter的核心，包括自动配置的支持, logging 和 yml配置
spring-boot-starter-actuator //为应用添加了管理特性
spring-boot-starter-aop  //面向切面编程的支持，包括spring-aop和AspectJ
spring-boot-starter-jdbc  //jdbc数据库的支持
spring-boot-starter-mail  //对javax.mail的支持
spring-boot-starter-redis //对redis的支持，包括spring-redis
spring-boot-starter-security   //对spring-security的支持
spring-boot-starter-test  //常见的测试依赖，包括JUnit, Hamcrest， Mockito 和 spring-test 模块
spring-boot-starter-thymeleaf   //对渲染模板引擎的支持
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
@SpringBootApplication
public class EdSpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdSpringbootJpaApplication.class, args);
	}
}
