package com.david.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.david.constants.RabbitmqConstant;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.AMQP.BasicProperties;

/**
 * 消息的消费者
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Consumer {
	/**
	 * 
	 */
	public static void main(String[] args) throws Exception, TimeoutException {
//		queueConsumer();
		topicConsumer();
	}
	/**
	 * topic消息的订阅者消费者，一个发布者，可以对应多个订阅者
	 */
	private static void topicConsumer() throws IOException, Exception {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.newConnection();
		factory.setHost(RabbitmqConstant.HOST);
		Channel channel = connection.createChannel();
		channel.queueDeclare(RabbitmqConstant.TOPIC_NAME, true, false, false, null);
		// 每次从队列中获取的数量
		channel.basicQos(1);
		DefaultConsumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body)
					throws IOException {
				String message = new String(body,"utf-8");
				System.out.println("receive:"+message);
//				try {
//                    throw  new Exception();
//                    //doWork(message);
//                }catch (Exception e){
//                    channel.abort();
//                }finally {
//                    System.out.println("Worker1 Done");
//                    channel.basicAck(envelope.getDeliveryTag(),false);
//                }
			}
		};
		// autoAck 如果为false，则只会接受一次，true，会一直接受
		boolean autoAck = true;
		// 消息消费完成确认
		channel.basicConsume(RabbitmqConstant.TOPIC_NAME, autoAck,consumer);
		
	}

	/**
	 * queue队列消息的消费者。一对一。
	 */
	private static void queueConsumer() throws IOException, TimeoutException {
		// 创建连接工厂
		ConnectionFactory factory = new ConnectionFactory();
		// 设置rabbitmq的地址
		factory.setHost(RabbitmqConstant.HOST);
		factory.setVirtualHost("/");
		// factory.setUsername(RabbitmqConstant.USERNAME);
		// factory.setPassword(RabbitmqConstant.PASSWORD);
		// factory.setPort(5672);
		// 通过工厂获取连接
		Connection connection = factory.newConnection();
		// 创建一个通道channel
		Channel channel = connection.createChannel();
		// 订阅消息
		channel.queueDeclare(RabbitmqConstant.QUEUE_NAME, false, false, false, null);
		// 获取消息。DefaultConsumer实现了consumer接口。
		com.rabbitmq.client.Consumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body)
					throws IOException {
				// 获取消息
				String message = new String(body, "utf-8");
				System.out.println("consumer receive：" + message + "");
			}
		};
		// 消息确认
		channel.basicConsume(RabbitmqConstant.QUEUE_NAME, true, consumer);
		// 当收到键盘输入 。让它再去执行下面的关闭资源。
		System.in.read();
		// 关闭channel和连接
		channel.close();
		connection.close();
	}
}
