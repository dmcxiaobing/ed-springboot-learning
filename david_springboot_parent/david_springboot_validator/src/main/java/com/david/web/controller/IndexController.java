package com.david.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.david.domain.Other;
import com.david.domain.User;

/**
 * 测试validator的controller
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class IndexController {

	/**
	 * 转发到表单页面。。这里使用的是freemarker。ftl
	 */
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	/**
	 * 保存信息。然后会验证表单信息
	 */
	@RequestMapping("/saveUser")
	public ModelAndView saveUser(@Validated User user, BindingResult userResult, @Validated Other other,
			BindingResult otherResult,Model model) {
		List<Map<String, String>> errorList = new ArrayList<>();
		loadErrorList(userResult, errorList);
		loadErrorList(otherResult, errorList);
		
		// 回显信息
		model.addAttribute("user",user);
		model.addAttribute("other",other);
		// 回显错误信息
		model.addAttribute("errorList",errorList);
		return new ModelAndView("index");
	}
	/**
	 * 获取验证的错误信息
	 */
	private void loadErrorList(BindingResult result, List<Map<String, String>> errorList) {
		Map<String,String> map = null;
		if (result.hasErrors()) {
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map = new HashMap<>();
				map.put("field", fieldError.getField());
				map.put("message", fieldError.getDefaultMessage());
				errorList.add(map);
			}
		}
	}

}
