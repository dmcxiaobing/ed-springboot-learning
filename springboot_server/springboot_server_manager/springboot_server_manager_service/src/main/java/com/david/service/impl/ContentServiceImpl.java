package com.david.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.david.service.ContentService;
import com.david.service.impl.data.ContentServiceImplData;

/*
 * 服务的发布者，实现接口
 */
//注册为 Dubbo 服务
@Service(version = "content",interfaceClass=ContentService.class)
@Component
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentServiceImplData contentServiceImplData;

	@Override
	public String sayHello(String name) {
		return contentServiceImplData.say(name);

	}

}
