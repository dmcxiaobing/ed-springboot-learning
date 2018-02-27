package com.david;

import javax.xml.ws.Endpoint;


/**
 * 发布webservice服务。。这个是服务端，客户端请参考：https://github.com/QQ986945193/webservice_client
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class DavidWebServicePublish {
	public static void main(String[] args) {
		// 定义webservice的发布地址，这个地址就是提供给外界访问webservice的url地址
		// url地址格式为http://ip:端口号/XXXX
		// 在浏览器中输入我们在WebServicePublish类中定义的address?wsdl(注意一定要加wsdl),即：http://localhost:8989/ws_server/webservice?wsdl
		String address = "http://localhost:8989/ws_server/webservice";
		// 使用Endpoint类提供的publish方法发布webservice，发布时要保证使用的端口号没有被其他应用占用
		Endpoint.publish(address, new DavidWebServiceImpl());
		System.out.println("发布webservice成功。。");
	}
}
