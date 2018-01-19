package com.david.edspringbootgradle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.david.edspringbootgradle.domain.Message;
import com.david.edspringbootgradle.service.UserService;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
@PropertySource("classpath:message.properties")
@RequestMapping(value = "/api/v1/", name = "用户API")
public class UserController {


	private Message message = new Message();
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping(value = "getUserList",method=RequestMethod.POST)
	public Object getUserList(@RequestParam(required = false) int current, @RequestParam(required = false) int rowCount,
			@RequestParam(required = false) String searchPhrase) {
		return userService.getUserList(current,rowCount,searchPhrase);
	}
	
	
	/**
	 * hello。这是一个测试方法
	 */
	// @ResponseBody
	// @RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello word gradle";
	}
}
