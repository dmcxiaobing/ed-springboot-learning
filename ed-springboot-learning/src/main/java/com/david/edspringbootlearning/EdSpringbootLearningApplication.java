package com.david.edspringbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动的application。建议放到根目录下面,主要用于做一些框架配置
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
//  @SpringBootApplication是一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration。
@SpringBootApplication
public class EdSpringbootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdSpringbootLearningApplication.class, args);
	}
}
