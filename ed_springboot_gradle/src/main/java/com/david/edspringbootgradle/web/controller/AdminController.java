package com.david.edspringbootgradle.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
//		model.addAttribute("user", true);
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

	/**
	 * 新闻 增加 表单页面
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/admin/news/add")
	public String newsAdd(Model model) {
		model.addAttribute("newsAdd", new News());
		return "admin/newsAdd";
	}
	
	/**
	 * 新闻 跳转到编辑页面
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin/news/edit")
	public String newsEdit(Model model,Long id) {
		News news = newsService.findById(id);
		model.addAttribute("newsEdit",news);
		return "admin/newsEdit";
	}
	
	
	/**
	 * 新闻 根据id删除
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/admin/news/del")
	public String deleteNews(Long id) {
		newsService.deleteById(id);
		return "redirect:/admin/news";
	}
	
	/**
	 * 新闻提交操作
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/admin/news/edit")
	public String newsSubmit(@ModelAttribute  News news) {
		User user = userService.getCurrentUser();
		newsService.save(news);
		return "redirect:/admin/news";
	}
	
	
}
