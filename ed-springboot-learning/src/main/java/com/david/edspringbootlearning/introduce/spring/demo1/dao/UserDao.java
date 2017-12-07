package com.david.edspringbootlearning.introduce.spring.demo1.dao;

import java.util.ArrayList;
import java.util.List;

import com.david.edspringbootlearning.introduce.spring.demo1.model.User;

/**
 * 模拟查询数据库数据
 * 
 * @author ：david
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */

public class UserDao {
	/**
	 * 模拟数据查询。。返回用户集合
	 */
	public List<User> queryList() {
		List<User> result = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			User user = new User("username" + 1, "password" + i, i + 1);
			result.add(user);
		}
		return result;
	}
}
