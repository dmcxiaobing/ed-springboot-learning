package com.david.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;



/**
 * 配置listener.更新message。192.168.1.100:15672
 * 这里为了测试，queues名字都是写的假的，实际根据需要更改。
 */
@Configuration
@RabbitListener(queues = "SPRING_BOOT_QUEUE_NAME")
public class AmqpListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(AmqpListener.class);

	@Bean
	public Queue fooQueue() {
		return new Queue( "SPRING_BOOT_QUEUE_NAME");
	}

	/**
	 * 从这里可以获得http://127.0.0.1:183/sendMq发送的信息
	 */
	@RabbitHandler
	public void process(@Payload String name) {
		LOGGER.info("AmqpListener: " + name);
	}
}
