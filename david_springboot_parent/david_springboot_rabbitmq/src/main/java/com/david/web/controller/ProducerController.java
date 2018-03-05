package com.david.web.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.config.AmqpConfig;
import com.david.config.SendConfig;
import com.david.config.Sender;
/**
 * 消息的生产者。这个是和springboot进行整合后。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class ProducerController {

//	@Autowired
	private Sender sender;
	
	
	
	@Autowired
	private SendConfig sendConfig;
	/**
	 * 发送消息。接受信息在AmqpListener中
	 */
	@RequestMapping("/send")
	public String send(String message) {
		sender.send(message);
		return "sendOk";
	}

	/**
	 * 发送消息。接受信息在AmqpListener中
	 */
	@RequestMapping("/sendCallback")
	public String sendCallback(String message) {
		sendConfig.send(message);
		return "sendOk";
	}

}
