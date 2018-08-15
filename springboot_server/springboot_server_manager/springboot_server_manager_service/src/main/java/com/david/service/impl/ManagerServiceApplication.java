package com.david.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



/**
 * springboot 内容管理类
 * 项目右击-->Run As-->Run Configurations
	在左侧Maven Build下选中自己的工程名
	然后在右侧Goals输入框中输入“clean package”
 * 
 * @author ：david
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class ManagerServiceApplication extends SpringBootServletInitializer{
	/*public static void main(String[] args) {
		 // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(ManagerServiceApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ManagerServiceApplication.class);
	}*/
	  public static void main(String[] args) {

	        new SpringApplicationBuilder(ManagerServiceApplication.class)
	                .web(false) // 非 Web 应用
	                .run(args);

	    }
}
