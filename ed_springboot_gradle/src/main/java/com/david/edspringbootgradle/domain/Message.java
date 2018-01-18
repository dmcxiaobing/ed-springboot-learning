package com.david.edspringbootgradle.domain;

import java.io.Serializable;

/**
 * 错误信息统一返回结果Javabean
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Message implements Serializable{

	private int code;
	private String message;
	private Object content;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [code=" + code + ", message=" + message + ", content=" + content + "]";
	}
	
	
	
}
