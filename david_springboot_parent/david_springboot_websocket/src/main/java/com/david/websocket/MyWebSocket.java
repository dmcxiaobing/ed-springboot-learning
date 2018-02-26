package com.david.websocket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

/**
 * websocket的一些消息管理
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@ServerEndpoint(value = "/websocket")
@Component
public class MyWebSocket {

	/* concurrent包的线程安全set,用来存放每个客户端对应的MyWebSocket对象 */
	private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<>();

	/**
	 * 与某个客户端的连接对话，需要通过它来给客户端发送数据
	 */
	private Session session;

	/**
	 * 群发自定义消息
	 */
	public static void sendInfo(String message) {
		// 遍历消息，然后进行发送
		for (MyWebSocket item : webSocketSet) {
			try {
				item.sendMessage(message);
			} catch (Exception e) {
				continue;
			}
		}
	}
	
	
	/**
	 * 连接成功调用的方法
	 */
	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		webSocketSet.add(this);
		System.out.println("有新连接加入！当前在线人数为"+webSocketSet.size());
		try {
			sendMessage("当前共有"+webSocketSet.size()+"位在线用户");
		} catch (Exception e) {
			System.out.println("连接成功了。IO异常");
		}
	}
	
	
	
	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this);
		System.out.println("有一个连接关闭，当前在线人数为"+webSocketSet.size());
	}

	
	/**
	 * 收到客户端消息后，调用的方法
	 */
	@OnMessage
	public void onMessage(String message,Session session) {
		System.out.println("来自客户端的消息："+message);
		// 收到之后，然后群发
		sendInfo(message);
	}
	
	
	/**
	 * 发生错误时调用
	 */
	@OnError
	public void onError(Session session,Throwable error) {
		System.out.println("发生错误了");
		error.printStackTrace();
	}
	
	/**
	 * 发送消息
	 */
	private void sendMessage(String message) throws IOException {
		this.session.getBasicRemote().sendText(message);
	}

}
