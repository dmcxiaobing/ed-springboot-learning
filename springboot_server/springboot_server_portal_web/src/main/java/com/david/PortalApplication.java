package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.david.service.MainService;
import com.david.service.impl.MainServiceImpl;
/**
 * 表现层
 * @author ：david  
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class PortalApplication {
	public static void main(String[] args) {
//		SpringApplication.run(PortalApplication.class, args);
		// 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(PortalApplication.class, args);
        MainServiceImpl mainService = run.getBean(MainServiceImpl.class);
        mainService.getMainContent();
	}
}
