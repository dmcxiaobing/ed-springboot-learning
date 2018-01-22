package com.david.edspringbootgradle.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.david.edspringbootgradle.domain.UserCreateForm;
import com.david.edspringbootgradle.service.UserService;

/**
 * 验证表单字段实现
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Component // 开启扫描
public class UserCreateFormValidator implements Validator {
	// 初始化userservice
	private final UserService userService;
	Logger logger = LoggerFactory.getLogger(UserCreateFormValidator.class);

	@Autowired
	public UserCreateFormValidator(UserService userService) {
		this.userService = userService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(UserCreateForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		logger.error("Validataing{}", target);
		UserCreateForm userCreateForm = (UserCreateForm) target;
		// 验证表单
		validateUsername(errors, userCreateForm);
	}

	/**
	 * 验证表单
	 */
	private void validateUsername(Errors errors, UserCreateForm userCreateForm) {
		if (userService.getUserByUsername(userCreateForm.getUsername())!=null) {
			// 用户名已存在
			errors.reject("username.exists", "User with this USERNAME already exists");
		}
	}

}
