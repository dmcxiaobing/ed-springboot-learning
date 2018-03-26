package com.david.entity;

import java.io.Serializable;
/**
 * 基于微信支付 所做的实体类
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class WxPayEntity implements Serializable{

	private String appid;
	private String partnerid;
	private String prepayid;
	private String packager;
	private String noncestr;
	private String timestamp;
	private String sign;
	private String code;
	private String msg;
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getPartnerid() {
		return partnerid;
	}
	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}
	public String getPrepayid() {
		return prepayid;
	}
	public void setPrepayid(String prepayid) {
		this.prepayid = prepayid;
	}
	public String getPackager() {
		return packager;
	}
	public void setPackager(String packager) {
		this.packager = packager;
	}
	public String getNoncestr() {
		return noncestr;
	}
	public void setNoncestr(String noncestr) {
		this.noncestr = noncestr;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "WxPayEntity [appid=" + appid + ", partnerid=" + partnerid + ", prepayid=" + prepayid + ", packager="
				+ packager + ", noncestr=" + noncestr + ", timestamp=" + timestamp + ", sign=" + sign + ", code=" + code
				+ ", msg=" + msg + "]";
	}
	
	
	
}
