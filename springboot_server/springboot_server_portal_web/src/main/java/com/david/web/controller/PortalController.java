package com.david.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.service.MainService;

/**
 * 
 * @author ：david
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class PortalController {
	@Autowired
	private MainService mainService;

	@RequestMapping("/index")
	public String index() {
		System.out.println(mainService.getMainContent());
		return "hello dubbo Springboot";
	}
}
