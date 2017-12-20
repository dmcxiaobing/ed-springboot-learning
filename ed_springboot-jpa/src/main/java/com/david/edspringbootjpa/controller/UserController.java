package com.david.edspringbootjpa.controller;

import java.rmi.server.UID;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.david.edspringbootjpa.dao.UserDao;
import com.david.edspringbootjpa.domain.Result;
import com.david.edspringbootjpa.domain.User;
import com.david.edspringbootjpa.enums.ResultEnum;
import com.david.edspringbootjpa.properties.UserProperties;
import com.david.edspringbootjpa.service.UserService;
import com.david.edspringbootjpa.util.ResultUtils;

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
	 * 添加一个用户.@Valid验证表单是否符合要求.
	 * 		{
			    "code": 1,
			    "msg": "缺少username字段，必填字段",
			    "data": null
			}
			
			{
			    "code": 0,
			    "msg": "成功",
			    "data": {
			        "username": "http://weibo.com/mcxiaobing",
			        "age": null
			    }
			}
	 */
	@PostMapping("/addUser")
	public Result<User> addUser(@Valid User user,BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			return ResultUtils.error(1, bindingResult.getFieldError().getDefaultMessage());
		}
		
		user.setUsername(user.getUsername());
		user.setAge(user.getAge());
		return ResultUtils.success(userDao.save(user));
	}
	
	
	/**
	 * 根据uid查询一个用户.restful风格。@PathVariable直接将url中的数据获取出来
	 */
	@GetMapping("/findById/{uid}")
	public User getUser(@PathVariable("uid") Integer uid) {
		return userDao.findOne(uid);
	}
	
	/**
	 * 新增或者更新一个用户。修改。post请求。get会有405不支持
	 * http://localhost:8082/update/3?username=xiaobing&age=345
	 */
	@PostMapping(value="/update/{uid}")
	public User updateUser(@PathVariable("uid")Integer uid,
			@RequestParam("username")String username,
			@RequestParam("age")Integer age) {
		User user = new User();
		user.setAge(uid);
		user.setUsername(username);
		user.setAge(age);
		return userDao.save(user);
	}
	
	
	/**
	 * 根据uid删除用户，使用restful风格
	 * http://localhost:8082/delete/2
	 * 
	 */
	@DeleteMapping(value="/delete/{uid}")
	public void deleteUser(@PathVariable(value="uid")Integer 
			uid) {
		userDao.delete(uid);
	}
	
	/**
	 * 通过年龄查询所有用户
	 * http://localhost:8082/findByAge/age/22
	 */
	@GetMapping(value="/findByAge/age/{age}")
	public List<User> findByAge(@PathVariable(value="age")Integer age){
		return userDao.findByAge(age);
	}
	
	@Autowired
	private UserService userService;
	
	/**
	 * 批量演示事务，插入多条数据
	 */
	@PostMapping("/insertTwo")
	public void insertTwo() {
		userService.insertTwo();
	}
	
	
	/**
	 * 根据id查询出age.演示自定义异常
	 */
	@GetMapping("/getAge/{uid}")
	public void getAge(@PathVariable("uid")Integer uid) {
		userService.getAge(uid);
	}
	

}
