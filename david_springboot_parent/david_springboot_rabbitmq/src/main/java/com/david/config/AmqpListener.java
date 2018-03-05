package com.david.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

import com.david.constants.RabbitmqConstant;

/**
 * 配置listener
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Configuration
@RabbitListener(queues = RabbitmqConstant.SPRING_BOOT_QUEUE_NAME)
public class AmqpListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(AmqpListener.class);

	@Bean
	public Queue fooQueue() {
		return new Queue(RabbitmqConstant.SPRING_BOOT_QUEUE_NAME);
	}

	/**
	 * 从这里可以获得http://127.0.0.1:8080/send?message=hel发送的信息
	 */
	@RabbitHandler
	public void process(@Payload String name) {
		LOGGER.info("AmqpListener: " + name);
	}
}
