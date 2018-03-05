package com.david.rabbitmq;

import java.util.concurrent.TimeoutException;

import com.david.constants.RabbitmqConstant;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.AMQP.Channel;
import com.rabbitmq.client.Connection;
/**
 * 消息生产者
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Producer {
	public static void main(String[] args) throws Exception, TimeoutException {
		// 创建连接工厂
		ConnectionFactory connectionFactory = new ConnectionFactory();
		// 设置rabbitmq的相关信息
		connectionFactory.setHost(RabbitmqConstant.HOST);
//		connectionFactory.setVirtualHost("/");   
//		connectionFactory.setUsername(RabbitmqConstant.USERNAME);
//		connectionFactory.setPassword(RabbitmqConstant.PASSWORD);
//		connectionFactory.setPort(5672);
		// 通过工厂获取一个新的连接
		Connection connection = connectionFactory.newConnection();
		// 创建一个通道
		com.rabbitmq.client.Channel channel = connection.createChannel();
		// 声明一个消息channel。queueDeclare第一个参数表示队列名称、第二个参数为是否持久化（true表示是，队列将在服务器重启时生存）、
//		第三个参数为是否是独占队列（创建者可以使用的私有队列，断开后自动删除）、第四个参数为当所有消费者客户端连接断开时是否自动删除队列、第五个参数为队列的其他参数
		channel.queueDeclare(RabbitmqConstant.QUEUE_NAME, false, false, false, null);
		String message = "hello rabbitmq message";
		// 发送消息
		channel.basicPublish("", RabbitmqConstant.QUEUE_NAME, null, message.getBytes("utf-8"));
		System.out.println("producer send::"+message);
		// 关闭通道和连接
		channel.close();
		connection.close();
		
	}
}
