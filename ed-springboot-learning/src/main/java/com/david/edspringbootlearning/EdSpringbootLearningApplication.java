package com.david.edspringbootlearning;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Spring Boot建议将我们main方法所在的这个主要的配置类配置在根包名下。
 * 启动的application。建议放到根目录下面,主要用于做一些框架配置
 * 自定义springboot页面。http://patorjk.com/software/taag/#p=display&h=3&v=3&f=Stampatello&t=david%20Spring%20Boot
 * 
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// @SpringBootApplication是一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration。
@SpringBootApplication
public class EdSpringbootLearningApplication {
	
	
	public static void main(String[] args) {
		// 第一种方法：直接启动springboot应用程序。
		SpringApplication.run(EdSpringbootLearningApplication.class, args);
		// 第二种方法，启动springboot应用。
//		SpringApplication application = new SpringApplication(EdSpringbootLearningApplication.class);
//		//并且关闭banner显示
//		application.setBannerMode(Mode.OFF);
		// 禁用命令行配置。
//		application.setAddCommandLineProperties(false);
//		application.run(args);
		// 第三种使用构建方法进行启动。开启日志
//		new SpringApplicationBuilder().bannerMode(Mode.LOG)
//        .sources(EdSpringbootLearningApplication.class)
//        .run(args);
	}
}
