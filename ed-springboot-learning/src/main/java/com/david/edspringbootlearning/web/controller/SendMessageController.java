package com.david.edspringbootlearning.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.edspringbootlearning.constant.BootConstants;
import com.david.edspringbootlearning.utils.CharsetUtils;
import com.david.edspringbootlearning.utils.HttpUtils;
import com.david.edspringbootlearning.utils.MD5;

/**
 * 简单的一个发送短信的接口
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
@RestController
public class SendMessageController {
	/**
	 * 简单发送短信，具体要求参考下面注释
	 */
	@RequestMapping("/sendMessage")
	public String sendMessage() {
		String accName = "986945193@qq.com";
		String accPwd = MD5.getMd5String("123456");
		String aimcodes = "986945193";
		String content = "你好，欢迎注册网站。【小冰科技】";
		String schTime = "";
		String dataType = "json";
		String msgId = "";
		Map<String, String> parameters = new HashMap<String, String>();  
        parameters.put("accName", accName);  
        parameters.put("accPwd", accPwd);  
        parameters.put("aimcodes", aimcodes);  
        parameters.put("content", content);  
        parameters.put("dataType", dataType);  
		String result = HttpUtils.sendPost(BootConstants.MESSAGE_SEND_HOST, parameters);
		System.out.println(result); 
		return result;
	}
	/**
	 * 简单发送短信，具体要求参考下面注释
	 */
	@RequestMapping("/sendMsg")
	public String sendMsg() {
		
		String Id = 300+"";
		String Name = "qq986945193";
		String Psw = MD5.getMd5String("123456");
		String Phone = "986945193";
		String Message = CharsetUtils.getURLEncoder( "你好，欢迎注册网站。【小冰科技】");
		String Timestamp = 0+"";
		Map<String, String> parameters = new HashMap<String, String>();  
		parameters.put("Id", Id);  
		parameters.put("Name", Name);  
		parameters.put("Psw", Psw);  
		parameters.put("Message", Message);  
		parameters.put("Phone", Phone);  
		parameters.put("Timestamp", Timestamp);  
		String result = HttpUtils.sendPost(BootConstants.MESSAGE_SEND_HOST_BEIDOU, parameters);
		System.out.println(result); 
		return result;
	}
	
//	http://host/send
//	2.1.2.	发送参数
//	字段名称	是否可空	说明
//	accName	否	用户名(乐信登录账号)
//	accPwd	否	密码(乐信登录密码32位MD5加密后转大写，如123456加密完以后为：E10ADC3949BA59ABBE56E057F20F883E)
//	aimcodes	否	手机号码(多个手机号码之间用英文半角“,”隔开,单次最多支持5000个号码)
//	content	否	内容(内容长度请参照发送短信页面提示)，注意：在内容的最后需要加上在设置并通过审核的签名。如：公司定于1月25日召开今年的企业年会，请务必安排好时间。
//	schTime	是	定时时间(格式为: 如为空则为即时短信,如需定时时间格式为“yyyy-mm-dd hh24:mi:ss”)
//	dataType	是	返回的数据(类型支持:json/xml/string 三种形式 默认string)
//	msgId	是	提交短信包的唯一id，推送短信回执时，会推送此值，用此值和手机号码来匹配短信的状态，如需要接受回执则必须提交此参数,单次提交只需要提交一个即可
//	接口测试实例，可以在浏览器中直接输入测试（建议使用POST方式）
//	http://ip/sdk/send?accName=***&accPwd=***&aimcodes=***&content=内容【签名】&dataType=string
//	2.1.3.	发送响应Json格式
//	字段名称	类型	说明
//	replyCode	整型	执行结果 1 成功 0失败
//	replyMsg	Text	成功或失败原因具体信息
//	succeedNum	整型	成功条数(当次提交成功的手机号码个数)
//	failedNum	整型	失败条数(当次提交失败的手机号码个数)
//	chargCount	整型	计费条数(当次提交计费的短信条数)
//	deduction	整型	计费金额(当次提交的计费金额,单位:厘)
//	balance	整型	余额(当次提交后的账户余额:单位:厘)
//	示例:
//	{"balance":"12882680","chargCount":61,"deduction":"3660","failedNum":0,"replyCode":1,"replyMsg":"发送成功!","succeedNum":61}


}
