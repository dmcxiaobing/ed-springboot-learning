package com.david.edspringbootjpa.exception;

import com.david.edspringbootjpa.enums.ResultEnum;

/**
 * 用户的异常。因为只要出异常都会统一报handler里面的位置异常，我们可以自定义属于我们自己的异常
 * 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 由于RuntimeException继承了Exception,所以我们这里直接继承RuntimeException
public class UserException extends RuntimeException {

	private Integer code;
	
	
	public UserException(Integer code) {
		super();
		this.code = code;
	}

	/**
	 * 添加构造方法
	 */
	public UserException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
