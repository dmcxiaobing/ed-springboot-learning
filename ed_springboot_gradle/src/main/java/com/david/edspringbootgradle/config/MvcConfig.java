package com.david.edspringbootgradle.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 1.spring boot默认加载文件的路径是 
	/META-INF/resources/ 
	/resources/ 
	/static/ 
	/public/ 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// 默认首页
		registry.addViewController("/").setViewName("index");
		// 默认登录页
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/admin/profile").setViewName("admin/profile");		
		registry.addViewController("/hello").setViewName("hello");
	}

}
