package com.david.web.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.utils.CookieUtil;
/**
 * 简单演示的cookie
 * @author ：david  
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class CookieController {
	
	/**
	 * 设置cookie
	 */
	@RequestMapping("/setcookie")
	public String setCookie(HttpServletRequest request,HttpServletResponse response) {
		CookieUtil.setCookie(response, "davidcookie", "davidcookievalue");
		return "setCookie";
	}
	
	/**
	 * 获取cookie
	 */
	@RequestMapping("/getcookie")
	public String getCookie(HttpServletRequest request,HttpServletResponse response) {
		String cookieValue = CookieUtil.getCookieValue(request, "davidcookie");
		System.out.println(cookieValue);
		return "getcookie";
	}
}
