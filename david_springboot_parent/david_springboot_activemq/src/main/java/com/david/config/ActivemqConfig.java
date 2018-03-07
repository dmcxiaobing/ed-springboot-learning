package com.david.config;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;

/**
 * activemq的配置信息
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Configuration
public class ActivemqConfig {

	/**
	 * 配置queue
	 */
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("mvp.queue");
	}

	/**
	 * 配置topic
	 */
	@Bean
	public Topic topic() {
		return new ActiveMQTopic("mvp.topic");
	}

	/**
	 * 配置一个factory
	 */
	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		// 设置用户名和密码，还有ip端口号
		return new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
	}

	/**
	 * 配置监听factory
	 */
	@Bean
	public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ActiveMQConnectionFactory connectionFactory) {
		DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
		bean.setPubSubDomain(true);
		bean.setConnectionFactory(connectionFactory);
		return bean;
	}

	@Bean
	public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ActiveMQConnectionFactory connectionFactory) {
		DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
		bean.setConnectionFactory(connectionFactory);
		return bean;
	}
	/**
	 * 配置一个模板类
	 */
	@Bean
	public JmsMessagingTemplate jmsMessagingTemplate(ActiveMQConnectionFactory connectionFactory) {
		return new JmsMessagingTemplate(connectionFactory);
	}
}
