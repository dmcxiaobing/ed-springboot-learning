package com.david.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.david.constants.RabbitmqConstant;
/**
 * Sender 这个是rabbitmq的简单配置，整合springboot。地址配置在application.properties
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
//@Configuration
public class Sender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	/**
	 * 发送消息
	 */
	public void send(String messageValue) {
		this.rabbitTemplate.convertAndSend(RabbitmqConstant.SPRING_BOOT_QUEUE_NAME, messageValue);
	}
	
}
