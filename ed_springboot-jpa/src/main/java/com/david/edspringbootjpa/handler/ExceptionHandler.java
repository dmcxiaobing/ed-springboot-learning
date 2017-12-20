package com.david.edspringbootjpa.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.david.edspringbootjpa.domain.Result;
import com.david.edspringbootjpa.enums.ResultEnum;
import com.david.edspringbootjpa.exception.UserException;
import com.david.edspringbootjpa.util.ResultUtils;

/**
 * 处理异常的返回。
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */

@ControllerAdvice
public class ExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
	/**
	 * 统一进行异常数据的返回
	 */
	@ResponseBody
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
	public Result handler(Exception e) {
		if (e instanceof UserException) {
			UserException userException = (UserException) e;
			return ResultUtils.error(userException.getCode(), userException.getMessage());
		}
		
		/**
		 * {
			    "code": -1,
			    "msg": "未知错误",
			    "data": null
			}
		 */
		logger.error("系统异常了{}",e);
		return ResultUtils.error(ResultEnum.UNKONW_ERROR.getCode(),ResultEnum.UNKONW_ERROR.getMsg());
	}
}
