package com.david.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 转发到上传的HTML
 * @author ：david  
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "upload";
	}
}
