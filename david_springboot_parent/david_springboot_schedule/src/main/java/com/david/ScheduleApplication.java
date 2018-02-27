package com.david;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.config.DynamicScheduleConfig;

/**
 * 测试定时任务
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
@SpringBootApplication
public class ScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleApplication.class, args);
	}
	
	
	@Autowired
	private DynamicScheduleConfig config;
	
	/**
	 * 动态修改定时任务的cron值
	 */
	@GetMapping("/updateTask")
	public String updateTask() {
		// 修改为每五秒执行一次
		config.setCron("0/5 * * * * ?");
		return "sucess";
	}
	
}
