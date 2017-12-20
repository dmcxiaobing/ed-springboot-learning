package com.david.edspringbootjpa.domain;

/**
 * 返回客户端的JAVABEAN封装
 * http请求返回的最外层对象
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
public class Result<T> {
	// 错误码
	private Integer code;
	// 提示信息
	private String msg;
	// 返回的具体内容。某个javabean
	private T data;

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

	public Result(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Result() {
		super();
	}

}
