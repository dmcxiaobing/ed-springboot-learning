package com.david.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.david.service.ContentService;
import com.david.service.MainService;

/**
 * 服务的消费者
 * 
 * @author ：david
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Component
public class MainServiceImpl implements MainService{
	@Reference(version = "1.0.0")
	ContentService contentService;

	/**
	 * 假如获取主页内容。从content服务中获取。
	 */
	@Override
	public String getMainContent() {
		// 从dubbo的发布者中获取
		return contentService.sayHello("hello duboo");
	}
}
