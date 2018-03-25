package com.david.constants;

/**
 * 支付宝常量类
 * 
 * @author ：david
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class AliPayConstant {
	// 商户PID
	public static final String PARTNER = "2088221943400000";
	// 商户收款账号
	public static final String SELLER = "dmcxiaobing@vip.qq.com";
	public static final String APPID = "2016052301400000";
	// 商户私钥，pkcs8格式
	public static final String RSA_PRIVATE = "MII0000gkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMCBrNR+syA+G+ccvVTq/j+maVjE8oD2jig9uj0TTgA2DaWHDqdetUToWyxk55EXRfLHIhXjlOVz1MMjmdXE/hXgpPQSFDww9/wPFNBWS6e/IlgqjAqYvpm/kGT2DQS9cOnwTQOxoxA1UQNkiEnePNQOD++9nN0E75cL+Wr3b9GpAgMBAAECgYA2TN2pWsvADoTkXfDx4Q8yeQhCJ9uXkPRsWW0NCUL5QEX9KOlzQH21IC2HijbfcEckwhLVRcqcJl4fZQ1hhR1+I+LytzATjW590b+fbOTYVdkCjJbpPOlmoJEM0Oe/74QsegekBiTi63V/f+ydUbh52ztsGZHyv8525+Sm6gNOYQJBAP6dkh2lzb1QMck05YAxGG67uKwH7YyPXLnuegzDs2vKopQ2OYmTIMTtfAgj3tpeGQzKFaiCoSKus+HbNen39i0CQQDBjaXIMFpg53md9SwOBP6sMlOHIx9LIVA3Wjg2lHJtNMctR7OA7Zq86Kc4VGRkF0r540nvdksJicZpFB1OsNLtAkEAp4Iq2u52CJJ17pWqV0f1dwRxXlxo4AyBSKGoEjW+GLBbfX6fI+9zo5tJ+mD/AFLf0BYzYYVvVU3yciixs5e6kQJBAJwxicJWOukOg1dUHbwmjbo6VqusTTmc5ZX1qX1qKDk2qTFCNnppxECEY0WS3Pzkyy2DHQwwYveMhmAPymLRUTUCQQCH9iv2ilU8fAHtdwiE4DH30fUsHW6F3OdQ1zSp0ZqMpvlUrqRjLHLxOLpGjPeqP1hqNhWxVHTm0i33RPtjgiiC";
	// 支付宝公钥
	public static final String RSA_PUBLIC = "MIGfMA00000NADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
	// 沙箱测试链接地址 https://openapi.alipaydev.com/gateway.do
	public static final String ALIPAY_URL = "https://openapi.alipay.com/gateway.do";
	// 支付宝，回调地址(商户外网可以访问的异步地址)
	public static final String ALIPAY_CALLBACK_URL = "http://127.0.0.1:8080/notifyAliPayUrl";

}
