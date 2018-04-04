package com.david.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 简单的拦截请求。
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class DavidInterceptor2 implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("DavidInterceptor2拦截器开始工作，拦截到当前请求地址：" + request.getRequestURL().toString());
		// 只有返回true才会继续向下执行，返回false取消当前请求
		if (true) {
			System.out.println("没有权限访问：" + request.getRequestURL().toString());
			response.sendRedirect("/error");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o,
			ModelAndView modelAndView) throws Exception {
		// 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
		System.out.println("DavidInterceptor2.postHandle:" + o);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception ex)
			throws Exception {
		// 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
		System.out.println("DavidInterceptor2.afterCompletion:" + o);
	}

}
