package com.david.edspringbootlearning.introduce.spring.demo1.config;

import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 自定义一个拦截器
 * 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 声明这是一个配置文件
@Configuration
public class MySpringMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * 自定义拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		HandlerInterceptor handlerInterceptor = new HandlerInterceptor() {

			@Override
			public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("自定义拦截器preHandle");
				return true;
			}

			@Override
			public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
					throws Exception {
				System.out.println("自定义拦截器postHandle");

			}

			@Override
			public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
					throws Exception {
				System.out.println("自定义拦截器afterCompletion");

			}
		};
		// 默认是拦截/**的
		registry.addInterceptor(handlerInterceptor).addPathPatterns("/**");

	}

	// 自定义消息转化器的第二种方法
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		converters.add(converter);

	}
}
