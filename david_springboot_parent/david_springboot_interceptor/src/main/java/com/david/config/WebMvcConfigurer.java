package com.david.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.david.interceptor.LoginInterceptor;

/**
 * 配置拦截器之后，需要新增配置。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{

	/**
	 * 重写此方法，添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new LoginInterceptor())
				// 这样的请求，不会走进拦截器
				.excludePathPatterns("/index/**")
				// 这样将会输出；true(处理是否登陆的请求)
				// >>>Login拦截器>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
				//>>>Login拦截器>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
				.addPathPatterns("/admin/**");
		
		
		super.addInterceptors(registry);
	}
}
