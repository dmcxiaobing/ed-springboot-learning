package com.david.utils;
/*
 * 支付的一些常量配置
 */
public class ConfigUtil {
	/**
	 * 服务号相关信息
	 */
	public final static String APPID = "wx852b5d9aca200000";// 服务号的应用号
	public final static String MCH_ID = "1342790000";// 商户号
	public final static String API_KEY = "d8752f5c167305fbf81cf7c177ef0000";// API密钥
	public final static String SIGN_TYPE = "MD5";// 签名加密方式

	public final static String UNIFIED_ORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
}
