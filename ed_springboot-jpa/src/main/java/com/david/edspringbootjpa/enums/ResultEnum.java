package com.david.edspringbootjpa.enums;

/**
 * 封装统一的错误信息。解决异常的返回整体规划
 * 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
public enum ResultEnum {

	UNKONW_ERROR(-1,"未知错误"),
	ERROR_MIX(20,"你是20"),
	ERROR_MAX(40,"你是40"),
	ERROR_CENTER(30,"你是30"),
	SUCCESS(0,"成功"),;
	
	
	
	
	
	
	/**
	 * 创建一个构造方法，用枚举进行统一规划
	 * @param code 返回结果code
	 * @param msg 返回结果信息
	 */
	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	
	private ResultEnum() {
	}


	// 返回错误的编号
	private Integer code;
	// 返回错误信息
	private String msg;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
