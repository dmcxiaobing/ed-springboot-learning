package com.david.config;

import java.util.Date;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

/**
 * 演示动态定时任务。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Component
@EnableScheduling
public class DynamicScheduleConfig implements SchedulingConfigurer {

	// 默认每秒执行一次定时任务
	private String cron = "0/1 * * * * ?";
	
	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}


	/**
	 * 实现此方法，执行所需要的定时任务
	 */
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// 定时任务1
		taskRegistrar.addTriggerTask(new Runnable() {
			
			@Override
			public void run() {
				// 此处执行定时任务的业务逻辑
				System.out.println("定时任务1，当前时间："+new Date());
			}
		}, new Trigger() {
			
			@Override
			public Date nextExecutionTime(TriggerContext triggerContext) {
				// 定时任务出发，可修改定时任务的执行周期
				CronTrigger trigger = new CronTrigger(cron);
				Date nextExecDate = trigger.nextExecutionTime(triggerContext);
				return nextExecDate;
			}
		});
		
		
		// 定时任务2
		taskRegistrar.addTriggerTask(new Runnable() {
			
			@Override
			public void run() {
				// 此处执行定时任务的业务逻辑
				System.out.println("定时任务2，当前时间："+new Date());
				
			}
		}, new Trigger() {
			
			@Override
			public Date nextExecutionTime(TriggerContext triggerContext) {
				// 定时任务出发，可修改定时任务的执行周期
				CronTrigger trigger = new CronTrigger(cron);
				Date nextExecDate = trigger.nextExecutionTime(triggerContext);
				return nextExecDate;
			}
		});
		
		// 定时任务3 此种不会因为cron的改变而改变任务执行时间
		taskRegistrar.addCronTask(new Runnable() {
			
			@Override
			public void run() {
				// 此处执行定时任务的业务逻辑
				System.out.println("定时任务3，当前时间："+new Date());
			}
		}, this.getCron());
		
		// 定时任务4，此种不会因为cron的改变而改变任务的执行时间
		taskRegistrar.addCronTask(new CronTask(new Runnable() {
			
			@Override
			public void run() {
				// 此处执行定时任务的业务逻辑
                System.out.println("定时任务四，当前时间：" + new Date());
			}
		}, new CronTrigger(this.getCron())));
		
		
	}
	
	
	
	
	

	
	
	
}
