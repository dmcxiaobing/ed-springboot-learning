package com.david.edspringbootlearning.introduce.freemarker.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.david.edspringbootlearning.introduce.freemarker.method.SortMethod;

/**
 * 简单的介绍的freemarkerController
 * 
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
@Controller
@RequestMapping("/")
public class FreemarkerController1 {
	/**
	 * 简单的输出。freemarker..转发到index.html.. html中只是简单的一些变量定义，以及连接，取值等简单运算
	 */
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		// 设置数据
		modelAndView.addObject("username", "你好，freemarker");
		// 设置转发的页面路径
		modelAndView.setViewName("/freemarker/index");
		return modelAndView;
	}

	/**
	 * 转发到free6
	 */
	@RequestMapping("/free6")
	public String free6() {
		System.out.println("free6");
		return "/freemarker/free6";
	}

	/**
	 * 转发到free1。简单设置一些值。在freemarker中进行取值
	 */
	@RequestMapping("/free1ModelAndView")
	public ModelAndView free1ModelAndView() {
		System.out.println("free1ModelAndView");
		ModelAndView modelAndView = new ModelAndView();
		// 设置数据
		modelAndView.addObject("intVar", 100);
		modelAndView.addObject("LongVar", 10000000000000000L);
		modelAndView.addObject("doubleVar", 3.141592675d);
		modelAndView.addObject("StringVar", "我是freemarker,是字符串！");
		modelAndView.addObject("booleanVar", true);
		modelAndView.addObject("dateVar1", new Date());
		modelAndView.addObject("nullVar1", null);
		modelAndView.addObject("nullVar", "我是空");
		// 设置转发路径
		modelAndView.setViewName("/freemarker/free1");
		return modelAndView;
	}

	/**
	 * 转发到free1.使用model传递数据。
	 */
	@RequestMapping("/free1")
	public String free1(Model model) {
		System.out.println("free1");
		model.addAttribute("intVar", 100);
		model.addAttribute("LongVar", 10000000000000000L);
		model.addAttribute("doubleVar", 3.141592675d);
		model.addAttribute("StringVar", "我是freemarker,是字符串！");
		model.addAttribute("booleanVar", true);
		model.addAttribute("dateVar1", new Date());
		model.addAttribute("nullVar1", null);
		model.addAttribute("nullVar", "我是空");
		return "/freemarker/free1";
	}

	/**
	 * 集合的List介绍
	 */
	@RequestMapping("/free2")
	public ModelAndView free2() {
		ModelAndView mv2 = new ModelAndView();
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("JavaScript");
		list.add("python");
		list.add("php");
		list.add("Html");
		mv2.addObject("myList", list);
		mv2.setViewName("/freemarker/free2");
		return mv2;
	}

	/**
	 * map的一些功能介绍.switch等介绍
	 */
	@RequestMapping(value = "/free3")
	public String free3(Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Java", "你好Java");
		map.put("address", "北京");
		map.put("身高", 172);
		map.put("money", 100.5);
		model.addAttribute("map", map);
		return "/freemarker/free3";
	}

	/**
	 * 排序的一些介绍
	 */
	@RequestMapping("/free4")
	public String free4(Model model) {
		// 设置数据
		model.addAttribute("sort_int", new SortMethod());
		return "/freemarker/free4";
	}

	/**
	 * 写一个通用的跳转..代替了。free7.free5
	 * 
	 * @PathVariable 将{page}传来的值绑定到 参数page中。
	 */
	@RequestMapping("/{page}")
	public String commonPage(@PathVariable String page) {
		System.out.println("commonPage" + page);
		return "/freemarker/" + page;
	}
}
