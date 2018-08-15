package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.david.service.MainService;
import com.david.service.impl.MainServiceImpl;
/**
 * 表现层  
 * 项目右击-->Run As-->Run Configurations
	在左侧Maven Build下选中自己的工程名
	然后在右侧Goals输入框中输入“clean package”
 * @author ：david  
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication(scanBasePackages = "com.david.*")
public class PortalApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
		// 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
//        ConfigurableApplicationContext run = SpringApplication.run(PortalApplication.class, args);
//        MainServiceImpl mainService = run.getBean(MainServiceImpl.class);
//        mainService.getMainContent();
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PortalApplication.class);
	}
}
