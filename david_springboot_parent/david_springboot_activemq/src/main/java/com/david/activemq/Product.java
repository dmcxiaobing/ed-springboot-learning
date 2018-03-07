package com.david.activemq;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息的生产者
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class Product {
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;

	@Autowired
	private Topic topic;
	
	/**
	 * 消息发布者，queue
	 */
	@RequestMapping("/sendQueue")
//	@Scheduled(fixedDelay=3000) 定时发送消息
	public String testProductQueueMessage() {
		jmsMessagingTemplate.convertAndSend(this.queue,"hi david..this is send queue message http://weibo.com/mcxiaobing");
		return "queueOk";
	}
	
	/**
	 * 消息发布者，topic
	 */
	@RequestMapping("/sendTopic")
//	@Scheduled(fixedDelay=3000) 定时发送消息
	public String sendTopic() {
		jmsMessagingTemplate.convertAndSend(this.topic,"hi david..this is send topic message http://weibo.com/mcxiaobing");
		return "topicOk";
	}
}
