package com.david.edspringbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.david.edspringbootjpa.properties.UserProperties;

/**
 * 这是一个简单的介绍，使用controller
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 这个注解代表。responsebody和controller的两个注解.返回json
@RestController
// 访问的映射
@RequestMapping("/hello")
public class HelloController {

	// 因为已经利用spring的注解java配置文件。所以直接这里获取
	@Autowired
	private UserProperties userProperties;
	
	/**
	 * 一个简单的映射方法访问
	 *1@RequestMapping("/say"),代表get和post访问均可请求。
	 *2@RequestMapping(value="/say",method=RequestMethod.GET),代表只能get才能访问
	 *3@RequestMapping(value="/say",method=RequestMethod.POST)代表只能post才能访问
	 *4@GetMapping(value="/say") 相当于第2种，只能get访问。
	 */
//	@RequestMapping("/say")
//	@RequestMapping(value="/say",method=RequestMethod.GET)
//	@RequestMapping(value="/say",method=RequestMethod.POST)
	@GetMapping(value="/say")
//	http://localhost:8082/hello/say?uid=22
	//@RequestParam 可以直接获取请求带有的参数uid的值。required代表是否必填。false为不是必填。defaultValue默认值
	public String say(@RequestParam(value="uid",required=false,defaultValue="0") Integer 
			uid) {
		return "uid=="+uid;
//		System.out.println(userProperties);
		
//		return "username"+userProperties.getUsername()+userProperties.getAge();
	}
}
