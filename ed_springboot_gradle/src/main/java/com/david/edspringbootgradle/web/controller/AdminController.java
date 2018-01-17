package com.david.edspringbootgradle.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.david.edspringbootgradle.domain.News;
import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.service.NewsService;
import com.david.edspringbootgradle.service.UserService;

/**
 * 后台管理员
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class AdminController {

	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;
	/**
	 * 管理主界面
	 * 
	 */
	@GetMapping("/admin/")
	public String adminIndex(Model model) {
		model.addAttribute("dashboard", true);
		model.addAttribute("userscount", 1);
		model.addAttribute("newscount", 1);
		return "admin/index";
	}
	
	/**
	 * 用户管理
	 */
	@GetMapping("/admin/user")
	public String adminUser(Model model) {
		model.addAttribute("user", true);
		return "admin/user";
	}
	
	/**
	 * 新闻管理
	 */
	@GetMapping("/admin/news")
	public String adminNews(Model model) {
		// 查询所有
		Iterable<News> newsList = newsService.findAll();
		model.addAttribute("newslist",newsList);
		return "admin/news";
	}

}
