package com.david.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * Javabean。
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Message implements Serializable{

	private Integer id;
	private String nickName;
	private String ip;
	private Date insertTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Message(Integer id, String nickName, String ip, Date insertTime) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.ip = ip;
		this.insertTime = insertTime;
	}
	public Message() {
		super();
	}
	
	
	
	
}
