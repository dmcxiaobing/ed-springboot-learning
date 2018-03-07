package com.david.activemq;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;

/**
 * 消息的消费者，订阅者
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Configuration // 注解以及功能 看自己具体需求来定
public class Consumer {

	/**
	 * 配置消息的名称以及工厂
	 */
	@JmsListener(destination = "mvp.topic", containerFactory = "jmsListenerContainerTopic")
	public void receiveTopic(String text) {
		System.out.println("topic receive:" + text);
	}
	
	@JmsListener(destination = "mvp.queue", containerFactory = "jmsListenerContainerQueue")
	public void reviceQueue(String text) {
		System.out.println("Queue receive:" + text);
	}
}
