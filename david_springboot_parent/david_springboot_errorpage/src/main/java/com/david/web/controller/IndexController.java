package com.david.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示错误代码中错误
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class IndexController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}


	@RequestMapping("/error500")
	public void error500() {
		int a = 5/0;
		System.out.println(a);
	}
	
	@RequestMapping("/error400/{id}")
	public Object error400(@PathVariable("id")Integer id) {
		
		System.out.println(id);
		return id ;
	}

}
