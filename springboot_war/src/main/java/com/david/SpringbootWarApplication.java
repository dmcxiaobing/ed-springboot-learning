package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * springboot打成war包。
 * 
 * 	项目右击-->Run As-->Run Configurations
	在左侧Maven Build下选中自己的工程名
	然后在右侧Goals输入框中输入“clean package”
 * 
 * @author ：david
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@SpringBootApplication
public class SpringbootWarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWarApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootWarApplication.class);
	}

}
