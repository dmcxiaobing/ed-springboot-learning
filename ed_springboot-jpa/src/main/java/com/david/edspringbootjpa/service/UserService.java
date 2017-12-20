package com.david.edspringbootjpa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.edspringbootjpa.dao.UserDao;
import com.david.edspringbootjpa.domain.User;
import com.david.edspringbootjpa.enums.ResultEnum;
import com.david.edspringbootjpa.exception.UserException;

/**
 * 测试事务管理以及错误信息
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 添加扫描注解
@Service
// 加入事务管理
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 直接插入两条数据
	 */
	public void insertTwo() {
		for (int i = 0; i < 2; i++) {
			User user = new User();
			user.setUsername("david"+i);
			user.setAge(22);
			if (i==1) {
				//故意报一个异常.由于加了@Transactional事务管理，所以则不会插入进去数据。
				int num = i/0;
			}
			userDao.save(user);
		}
	}

	/**
	 * 演示自定义异常
	 */
	public void getAge(Integer uid) {
		User user = userDao.findOne(uid);
		Integer age = user.getAge();
		if (age==20) {
			// 提示错误。
			throw new UserException(ResultEnum.ERROR_MIX);
		}
		if (age == 30) {
			throw new UserException(ResultEnum.ERROR_CENTER);
		}
		if (age == 40) {
			throw new UserException(ResultEnum.ERROR_MAX);
		}
	}

}
