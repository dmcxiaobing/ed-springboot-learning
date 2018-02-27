package com.david.config;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 静态定时任务。使用schedule.为了演示动态定时任务，这里先注释掉
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
//@Component
//@EnableScheduling
public class SchedulingConfig {

	/**
	 * 每10秒执行一次
	 */
	@Scheduled(cron="0/10 * * * * ? ")
	public void doJobByCron() {
		System.out.println(new Date()+"每十秒执行一次doJobByCron");
	}
	
	/**
	 * 固定每5秒执行一次
	 */
	@Scheduled(fixedRate=5*1000)
	public void doJobByFixedRate() {
		System.out.println(new Date()+"固定每五秒执行一次：doJobByFixedRate");
	}
	
	/**
	 * 上次任务结束 一秒后再次执行
	 */
	@Scheduled(fixedDelay=1*1000)
	public void doJobByFixedDelay() {
		System.out.println(new Date()+"上次任务结束 一秒后再次执行：doJobByFixedDelay");
	}
	
	/**
	 * 第一次延迟1秒后执行，之后按fixedRate的规则，每2秒执行一次
	 */
	@Scheduled(initialDelay=1000,fixedDelay=2000)
	public void doInitialDelay() {
		System.out.println(new Date()+"第一次延迟1秒后执行，之后按fixedRate的规则，每2秒执行一次：doInitialDelay");
	}
	
	
	
}
