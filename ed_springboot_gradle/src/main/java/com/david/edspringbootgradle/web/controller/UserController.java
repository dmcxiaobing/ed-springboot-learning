package com.david.edspringbootgradle.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.david.edspringbootgradle.config.UserCreateFormValidator;
import com.david.edspringbootgradle.domain.Message;
import com.david.edspringbootgradle.domain.User;
import com.david.edspringbootgradle.domain.UserCreateForm;
import com.david.edspringbootgradle.service.UserService;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
@PropertySource("classpath:message.properties")
@RequestMapping(value = "/api/v1/", name = "用户API")
public class UserController {

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	// 返回信息
	private Message message = new Message();
	@Autowired
	private UserCreateFormValidator userCreateFormValidator;
	@Autowired
	private UserService userService;

	/**
	 * 创建用户验证表单
	 */
	@InitBinder("userCreateForm")
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(userCreateFormValidator);
	}

	/**
	 * 查看用户是否登录状态
	 */
	@RequestMapping(value = "i/userLogin", method = RequestMethod.POST)
	public ResponseEntity<Message> userLogin(HttpServletRequest request) {
		// 调用登陆的接口
		logger.error("查看用户是否登录状态接口");
		User user = userService.getCurrentUser();
		if (user == null) {
			message.setMessage(0, "用户未登陆");
			return new ResponseEntity<Message>(message, HttpStatus.OK);
		} else {
			message.setMessage(1, "用户已成功登陆", user);
			return new ResponseEntity<Message>(message, HttpStatus.OK);
		}
	}

	/**
	 * 创建用户接口
	 */
	@RequestMapping(value="create",method=RequestMethod.POST)
	public ResponseEntity<Message> handleUserCreateForm(@Valid @RequestBody UserCreateForm form
			,BindingResult bindingResult){
		logger.debug("Processing user create form={}, bindingResult={}", form, bindingResult);
		if (bindingResult.hasErrors()) {
			// 验证失败
			message.setMessage(0,"表单字段验证失败");
			return new ResponseEntity<Message>(message,HttpStatus.OK);
		}
		try {
			userService.create(form);
		} catch (Exception e) {
			bindingResult.reject("创建失败", "创建用户失败");
			message.setMessage(0, "创建用户失败");
			return new ResponseEntity<Message>(message,HttpStatus.OK);
		}
	
		// 创建成功
		message.setMessage(1, "创建成功");
		return new ResponseEntity<Message>(message,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	/**
	 * 使用ResponseEntity做返回结果，根据id查找用户
	 */
	@RequestMapping(value = "i/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<Message> findUserById(@PathVariable Long id) {
		User user = userService.findUserById(id);
		HttpStatus status = user != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
		if (user == null) {
			message.setMessage(0, "未找到用户");
		} else {
			message.setMessage(1, "用户信息", user);
		}
		return new ResponseEntity<Message>(message, status);
	}

	/**
	 * 上传用户头像
	 */
	@RequestMapping(value="i/uploadImage",method=RequestMethod.POST)
	public ResponseEntity<?> uploadImage(@RequestParam MultipartFile file,HttpServletRequest request){
		message.setMessage(1,"用户头像上传成功",userService.uploadImage(file,request));
		return new ResponseEntity<Message>(message,HttpStatus.OK);
		
	}
	
	
	/**
	 * 获取用户列表
	 */
	@RequestMapping(value = "getUserList", method = RequestMethod.POST)
	public Object getUserList(@RequestParam(required = false,defaultValue="0") int current, @RequestParam(required = false,defaultValue="10") int rowCount,
			@RequestParam(required = false) String searchPhrase) {
		return userService.getUserList(current, rowCount, searchPhrase);
	}

	/**
	 * hello。这是一个测试方法
	 */
	// @ResponseBody
	// @RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello word gradle";
	}
}
