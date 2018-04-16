package com.david.entity;

import java.io.Serializable;

/**
 * 响应数据
 */
public class ResponseEntity implements Serializable {

	private String userid;
	private String phone;

	private int code;
	private String data;
	private String aesKey;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAesKey() {
		return aesKey;
	}

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ResponseEntity [userid=" + userid + ", phone=" + phone + ", code=" + code + ", data=" + data
				+ ", aesKey=" + aesKey + "]";
	}

	public ResponseEntity(String userid, String phone) {
		super();
		this.userid = userid;
		this.phone = phone;
	}

	public ResponseEntity() {
		super();
	}


}
