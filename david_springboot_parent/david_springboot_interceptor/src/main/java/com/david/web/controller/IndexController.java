package com.david.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 简单的controller
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class IndexController {

	@RequestMapping("/index/user")
	public String user() {
		System.out.println("user");
		return "user";
	}
	
	@RequestMapping("/admin/user")
	public String adminUser() {
		System.out.println("admin/user");
		return "adminUser";
	}
}
