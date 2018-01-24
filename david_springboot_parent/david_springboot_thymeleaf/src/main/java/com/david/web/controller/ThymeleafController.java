package com.david.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 简单介绍支持thymeleaf
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class ThymeleafController {

	@RequestMapping("/index")
	public String hello(HttpServletRequest request,
			@RequestParam(value = "name", required = false, defaultValue = "david_springboot_thymeleaf index") String name) {
		request.setAttribute("name", name);
		return "index";
	}
}
