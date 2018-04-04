package com.david.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.core.MethodParameter;
import org.springframework.util.CollectionUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义一个interceptor。拦截器。
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class DavidInterceptor1 implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
			throws Exception {
		System.out.println("DavidInterceptor1拦截器开始工作，拦截到当前请求地址：" + request.getRequestURL().toString());
		// 只有返回true才会继续向下执行，返回false取消当前请求
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			ModelAndView modelAndView) throws Exception {
		 // 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
		HandlerMethod method = (HandlerMethod) object;
		//获取 请求的一些方法
		System.err.println("methodName:"+method.getMethod().getName());
		System.err.println("returnType:"+method.getMethod().getReturnType());
		System.err.println("methodParameters:"+method.getMethodParameters());
		 MethodParameter[] parameters = method.getMethodParameters();
	        if (null != parameters) {
	            for (MethodParameter parameter : parameters) {
	                System.out.println("  -- parameterIndex:" + parameter.getParameterIndex() + ",parameterName:" + parameter.getParameterName() + ",parameterType:" + parameter.getParameterType());
	            }
	        }
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex)
			throws Exception {
		 // 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
		System.err.println("afterCompletion清理资源。。。");
		// 这里就简单的清理session
		HttpSession session = request.getSession();
		Map<String, Object> map = (Map<String, Object>) session.getAttribute("map");
		if (!CollectionUtils.isEmpty(map)) {
			session.removeAttribute("map");
			System.out.println("清理资源完成。。。afterCompletion");
		}
	}

}
