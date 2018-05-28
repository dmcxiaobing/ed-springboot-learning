package com.david.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Sender 这个是rabbitmq的简单配置，整合springboot。地址配置在application.properties
 */
@Configuration
public class Sender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	/**
	 * 发送消息
	 * topicName :主题名
	 * messageValue:内容
	 */
	public void send(String topicName,String messageValue) {
		this.rabbitTemplate.convertAndSend(topicName, messageValue);
	}
	
	
	
	
}
