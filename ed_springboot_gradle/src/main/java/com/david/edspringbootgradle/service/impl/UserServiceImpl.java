package com.david.edspringbootgradle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getUserList(int current, int rowCount, String searchPhrase) {
		return null;
	}

	/**
	 * 获取当前用户
	 */
	@Override
	public User getCurrentUser() {
		return userRepository.findByUsername(getCurrentUsername());
	}

	/**
	 * 获取当前登陆的用户名称
	 */
	@Override
	public String getCurrentUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		return username;
	}

}
