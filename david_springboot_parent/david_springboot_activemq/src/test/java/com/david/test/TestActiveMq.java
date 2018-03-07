package com.david.test;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.junit.Test;

/**
 * activemq的使用介绍
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class TestActiveMq {

	private static final String activeMqUrl = "tcp://192.168.197.128:61616";
	/**
	 * 发送queue..发布者producer
	 */
//	@Test
	public void testQueueProducer()throws Exception{
		// 创建一个连接工厂对象ConnectionFactory对象。需要制定activemq的ip以及端口号
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(activeMqUrl);
		// 使用ConnectionFactory创建一个Connection对象
		Connection connection = connectionFactory.createConnection();
		// 开启连接。调用connection对象的start方法
		connection.start();
		// 使用connection对象创建一个session对象。
		// 第一个参数是否开启事务，一般不使用事务。保证数据的一直，使用消息队列。
		// 如果第一个参数为true，，第二个参数则自动忽略。如果不开启事务为false，则第二个参数为消息的应答模式。这里写自动应答
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 使用session对象创建一个destionation对象。两种形式queue，topic。现在使用queue。
		// 参数就是消息队列的名称
		Queue queue = session.createQueue("test-queue");
		// 使用session对象创建一个producer对象
		MessageProducer producer = session.createProducer(queue);
		// 创建一个TextMessage对象
//		TextMessage textMessage = new ActiveMQTextMessage();
//		textMessage.setText("hello activemq");
		TextMessage textMessage = session.createTextMessage(" david qq986945193");
		// 发送消息
		producer.send(textMessage);
		// 关闭资源
		producer.close();
		session.close();
		connection.close();
		
	}
	/**
	 * 接受queue，消费者
	 */
	@Test
	public void testQueueConsumer()throws Exception{
		// 创建一个连接工厂对象ConnectionFactory对象。需要制定activemq的ip以及端口号
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(activeMqUrl);
		// 使用ConnectionFactory创建一个Connection对象
		Connection connection = connectionFactory.createConnection();
		// 开启连接。调用connection对象的start方法
		connection.start();
		// 使用connection对象创建一个session对象。
		// 第一个参数是否开启事务，一般不使用事务。保证数据的一直，使用消息队列。
		// 如果第一个参数为true，，第二个参数则自动忽略。如果不开启事务为false，则第二个参数为消息的应答模式。这里写自动应答
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 使用session对象创建一个destionation对象。两种形式queue，topic。现在使用queue。需要和发布者一致
		// 参数就是消息队列的名称
		Queue queue = session.createQueue("test-queue");
		// 使用session创建一个consumer对象
		MessageConsumer consumer = session.createConsumer(queue);
		// 向consumer对象中设置一个MessageListener对象。用来接收消息
		consumer.setMessageListener(new MessageListener() {
			
			@Override
			public void onMessage(Message message) {
				// 取出消息的内容
				if (message instanceof TextMessage) {
					TextMessage textMessage = (TextMessage) message;
					try {
						String text = textMessage.getText();
						// 打印出发送的消息内容。
						System.out.println(text);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		// 一直监听。暂时。等待消息。
//		while (true) {
//			Thread.sleep(100);
//		}
		// 当收到键盘输入 。让它再去执行下面的关闭资源。
		System.in.read();
		// 关闭资源。
		consumer.close();
		session.close();
		connection.close();
		
	}
	
	
	/**
	 * 测试topic。发布者producer
	 */
	@Test
	public void testTopicProducer()throws Exception{
		// 创建一个连接工厂对象ConnectionFactory对象。需要制定activemq的ip以及端口号
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(activeMqUrl);
		// 使用ConnectionFactory创建一个Connection对象
		Connection connection = connectionFactory.createConnection();
		// 开启连接。调用connection对象的start方法
		connection.start();
		// 使用connection对象创建一个session对象。
		// 第一个参数是否开启事务，一般不使用事务。保证数据的一直，使用消息队列。
		// 如果第一个参数为true，，第二个参数则自动忽略。如果不开启事务为false，则第二个参数为消息的应答模式。这里写自动应答
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 使用session对象创建一个destionation对象。两种形式queue，topic。现在使用topic。
		Topic topic = session.createTopic("test_topic");
		// 创建一个producer对象
		MessageProducer producer = session.createProducer(topic);
		// 创建一个TextMessage对象
		TextMessage message = session.createTextMessage("hello topic activemq");
		// 发送消息
		producer.send(message);
		// 关闭资源
		producer.close();
		session.close();
		connection.close();
	
	
	}
	
	/**
	 * 订阅者，topic。consumer
	 */
	@Test
	public void testTopicConsumer() throws Exception{
		// 创建一个连接工厂对象ConnectionFactory对象。需要制定activemq的ip以及端口号
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(activeMqUrl);
		// 使用ConnectionFactory创建一个Connection对象
		Connection connection = connectionFactory.createConnection();
		// 开启连接。调用connection对象的start方法
		connection.start();
		// 使用connection对象创建一个session对象。
		// 第一个参数是否开启事务，一般不使用事务。保证数据的一直，使用消息队列。
		// 如果第一个参数为true，，第二个参数则自动忽略。如果不开启事务为false，则第二个参数为消息的应答模式。这里写自动应答
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 使用session对象创建一个destionation对象。两种形式queue，topic。现在使用topic。需要和发布者一致
		Topic topic = session.createTopic("test_topic");
		// 使用session对象创建一个consumer对象
		MessageConsumer consumer = session.createConsumer(topic);
		// 向consumer对象设置一个MessageListener对象。用来接收消息
		consumer.setMessageListener(new MessageListener() {
			
			@Override
			public void onMessage(Message message) {
				// 取出消息
				if (message instanceof TextMessage) {
					try {
						TextMessage textMessage = (TextMessage) message;
						String text = textMessage.getText();
						// 打印消息
						System.out.println(text);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		// 一直监听。暂时。等待消息。
//		while (true) {
//			Thread.sleep(100);
//		}
		// 当收到键盘输入 。让它再去执行下面的关闭资源。
		System.in.read();
		// 关闭资源。
		consumer.close();
		session.close();
		connection.close();
	}
	
}
