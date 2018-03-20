package com.david.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页，登陆，权限等
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
public class HomeController {

	/**
	 * 首页
	 */
	@RequestMapping({"/","/index"})
	public String index() {
		return "/index";
	}
	
	// 获取到登陆失败的信息
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Map<String,Object> map)throws Exception {
		// 登录失败，从request中获取shiro处理的异常信息。
		// shiroLoginFailure：就是shiro异常类的全类名
		String exception = (String) request.getAttribute("shiroLoginFailure");
		System.out.println("exception:"+exception);
		String msg = "";
		if (exception!=null) {
			if (UnknownAccountException.class.getName().equals(exception)) {
				msg = "账号不存在";
			}
			if (IncorrectCredentialsException.class.getName().equals(exception)) {
				msg = "密码不正确";
			}
			if ("kaptchaValidateFailed".equals(exception)) {
				msg = "验证码不正确";
			}else {
				msg = exception+"";
			}
			
			
		}
		map.put("msg", msg);
		return "/login";
	}
	
	
	
	/**
	 * 没有权限
	 */
	@RequestMapping("/403")
	public String unauthorizedRole() {
        System.out.println("------没有权限-------");
		return "403";
	}
}
