package com.david.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.utils.SessionUtil;

/**
 * session的简单实用。
 * @author ：david  
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class SessionController {

	/**
	 * 设置session
	 */
	@RequestMapping("/setsession")
	public String setsession(HttpServletRequest request,HttpServletResponse response) {
		SessionUtil.setSessionAttribute("davidsession", "davidsessionvalue");
		return "setsession";
	}
	
	/**
	 * 获取session
	 */
	@RequestMapping("/getsession")
	public String getsession(HttpServletRequest request,HttpServletResponse response) {
		String sessionValue = (String) SessionUtil.getSessionAttribute("davidsession");
		System.out.println(sessionValue);
		return "getsession";
	}
}
