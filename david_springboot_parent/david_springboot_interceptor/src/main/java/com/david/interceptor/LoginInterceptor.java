package com.david.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 一个简单的登陆的拦截器
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class LoginInterceptor implements HandlerInterceptor{

	/**
	 *  // 只有返回true才会继续向下执行，返回false取消当前请求
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (true) {
			// 假如说如果登陆了。
			System.out.println("true");
			return true;
		}else {
			System.out.println("true");
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
      System.out.println(">>>Login拦截器>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
      System.out.println(">>>Login拦截器>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
		
	}

}
