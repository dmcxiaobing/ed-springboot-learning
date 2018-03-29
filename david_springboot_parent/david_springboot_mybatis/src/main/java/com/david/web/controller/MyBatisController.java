package com.david.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.david.entity.Message;
import com.david.entity.PageBean;
import com.david.service.IMessageService;
import com.github.pagehelper.PageHelper;

/**
 * 简单演示mybatis、pagehelper
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */

@Controller
public class MyBatisController {

	
	@Autowired
	private IMessageService messageService;
	
	
	/**
	 * currentPage 当前页。
	 * pageSize;每页显示的数量
	 */
	@RequestMapping("/{currentPage}/{pageSize}")
	public String index(@PathVariable("currentPage")int currentPage
			,@PathVariable("pageSize")int pageSize
			,Model model) {
		//设置指定当前需要显示的页码 currentPage...页面显示数量pageSize
		PageHelper.startPage(currentPage, pageSize);
		// 使用model 将数据转发到页面
		model.addAttribute("page", new PageBean<Message>(messageService.list()));
		return "index";
	}
}
