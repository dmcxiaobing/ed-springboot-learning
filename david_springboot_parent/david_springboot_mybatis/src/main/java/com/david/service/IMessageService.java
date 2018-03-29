package com.david.service;

import java.util.List;

import com.david.entity.Message;

public interface IMessageService {

	List<Message> list();
	int count();
}
