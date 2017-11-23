package com.david.edspringbootlearning.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是一个简单的介绍 ，controller
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
/**
 * springboot 项目启动方式。介绍三种。
 * 1，直接在eclipse中运行,启动我们的application
 * 2，使用maven进行运行。命令：mvn spring-boot:run
 * 3，将项目使用maven打成jar包，直接运行jar包
 * 
 */
 @RestController // 这个注解，表示此类是一个controller.直接返回的json
public class IntroduceController {

	/**
	 * 一个最简单的hello world
	 * http://localhost:8080/helloworld
	 */
	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
	public String helloWorld() {
		return "hello spring boot...hello world";
	}
	
}
