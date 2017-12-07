package com.david.edspringbootlearning.introduce.spring.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.edspringbootlearning.introduce.spring.demo1.dao.UserDao;
/**
 * service层
 * @author ：david  
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
import com.david.edspringbootlearning.introduce.spring.demo1.model.User;

@Service
public class UserService {

	// 注入spring容器中的bean对象
	@Autowired
	private UserDao userDao;

	public java.util.List<User> queryList() {
		// 调用userDao中的方法进行查询
		return this.userDao.queryList();
	}

}
