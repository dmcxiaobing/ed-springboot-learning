package com.david.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.david.service.ContentService;

/*
 * 服务的发布者，实现接口
 */
//注册为 Dubbo 服务
@Service(version = "1.0.0")
public class ContentServiceImpl implements ContentService {

	@Override
	public String sayHello(String name) {
		System.out.println("我是服务的发布者。。"+name);
		return "ContentServiceImpl";
	}

}
