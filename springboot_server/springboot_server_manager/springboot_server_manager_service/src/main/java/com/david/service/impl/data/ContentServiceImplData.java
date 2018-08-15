package com.david.service.impl.data;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class ContentServiceImplData {

	public String say(String name) {
		System.out.println("我是服务的发布者。。"+name);
		
		return "ContentServiceImpl";
	}

}
