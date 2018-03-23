package com.david.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
/**
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class BaseController {

	/**
	 * 得到request
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	/**
	 * 得到session
	 */
	public static HttpSession getSession() {
		return getRequest().getSession();
	}
	
}
