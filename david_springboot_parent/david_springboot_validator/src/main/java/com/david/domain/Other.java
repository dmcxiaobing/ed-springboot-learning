package com.david.domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

/**
 * 其他的额外验证信息
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class Other {
	@Length(max = 18, min = 15, message = "身份证长度为15或者18位")
	private String idcard;

	@Pattern(regexp = "[0-9]{11}", message = "手机号格式错误")
	private String phone;

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Other [idcard=" + idcard + ", phone=" + phone + "]";
	}
	
	
	
	
}
