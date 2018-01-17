package com.david.edspringbootgradle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.repository.UserRepository;
import com.david.edspringbootgradle.service.UserService;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
