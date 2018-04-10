package com.david.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 简单的测试。将springboot打成war包
 * 
 * @author ：david
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class HelloApplication {
	/**
	 * 简单测试index
	 */
	@RequestMapping("/index")
	public String setCookie(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

}
