package com.david.edspringbootgradle.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class UserController {

	/**
	 * hello。这是一个测试方法
	 */
	// @ResponseBody
	// @RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello word gradle";
	}
}
