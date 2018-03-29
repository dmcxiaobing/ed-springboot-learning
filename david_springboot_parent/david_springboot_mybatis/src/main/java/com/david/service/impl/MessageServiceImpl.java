package com.david.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.entity.Message;
import com.david.mapper.MessageMapper;
import com.david.service.IMessageService;

/**
 * 业务层
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Service
public class MessageServiceImpl implements IMessageService{

	@Autowired
	private MessageMapper messageMapper;
	
	
	@Override
	public List<Message> list() {
		return messageMapper.list();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return messageMapper.count();
	}

}
