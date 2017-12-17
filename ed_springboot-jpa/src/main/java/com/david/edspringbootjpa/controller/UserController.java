package com.david.edspringbootjpa.controller;

import java.rmi.server.UID;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.david.edspringbootjpa.dao.UserDao;
import com.david.edspringbootjpa.domain.User;

/**
 * 一个用来简单的写jpa增删改查
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 直接返回json
@RestController
public class UserController {
	// 得到一个输出日志的对象
	private final static Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);

	// 这里直接使用dao进行操作数据了，不去写业务逻辑了.接口直接操作
	@Autowired
	private UserDao userDao;
	
	/**
	 * 查询所有用户
	 */
	@GetMapping("/list")
	public List<User> getList(){
		// 因为我们的dao继承了JpaRepository,所以里面他帮我们实现了好多方法
		return userDao.findAll();
	}
	
	/**
	 * 根据uid查询一个用户.restful风格。@PathVariable直接将url中的数据获取出来
	 */
	@GetMapping("/findById/{uid}")
	public User getUser(@PathVariable("uid") Integer uid) {
		return userDao.findOne(uid);
	}
	
	
	
//	private UserService userService;
	
	
	

}
