package com.david.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.utils.ConfigUtil;
import com.david.utils.FastJsonUtil;
import com.david.utils.HttpClient;
import com.david.utils.PayConfig;
import com.david.weixin.WXPayConstants;
import com.david.weixin.WXPayUtil;


/**
 * 生成支付二维码，以及检查支付结果
 * 官方api地址：https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class ProductWxPayController {
	/**
	 * 生成支付二维码。
	 */
	@RequestMapping("/createCode")
	public String createCode(HttpServletResponse response) throws Exception{
		// 获取请求的参数。这里直接设为家的
		String pname = "java软件开发实战书籍";
		String price = "200";// 设置金额为200
		// 编写商户的信息..可和WxPayController进行对应
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("appid", PayConfig.appid);
		paramMap.put("mch_id", PayConfig.partner);  //商户的账号
		paramMap.put("nonce_str", WXPayUtil.generateNonceStr()); //随机字符串
		paramMap.put("body", pname); //商品描述
		String orderId = WXPayUtil.generateNonceStr(); // 订单号
		paramMap.put("out_trade_no", orderId);
		paramMap.put("total_fee", price); // 支付的金额 , 单位是分
		paramMap.put("spbill_create_ip", "127.0.0.1"); // ip地址
		paramMap.put("notify_url", PayConfig.notifyurl); //通知地址 
		paramMap.put("trade_type", "NATIVE"); //交易类型 app支付改为APP，请参考WxPayController
		//3 生成数字签名， 同时把上面的参数都编写成xml格式的数据
		String xml = WXPayUtil.generateSignedXml(paramMap, PayConfig.partnerkey);
		HttpClient client  = new HttpClient(ConfigUtil.UNIFIED_ORDER_URL);
		client.setHttps(true);//开启https协议
		client.setXmlParam(xml);//设置xml格式的数据
		
	
		client.post();//发送请求
		// 获取微信支付后台返回的数据
		String contentResult = client.getContent();
		Map<String, String> resultMap = WXPayUtil.xmlToMap(contentResult);//把返回的数据转换成map集合
		resultMap.put("orderId", orderId);
		resultMap.put("money", price);
		// 把map解析转换成json格式的数据。然后返回给前端js请求
		String json = FastJsonUtil.toJSONString(resultMap);
		FastJsonUtil.write_json(response, json);
		return null;
	}
	
	
	/**
	 * 检查是否支付成功。checkStatus
	 */
	@RequestMapping("/checkStatus")
	public void checkStatus(HttpServletResponse response,HttpServletRequest request) throws Exception{
		// 得到商品的id.
		String orderId = request.getParameter("orderId");
		// 填写商户信息
		Map<String, String> param = new HashMap<String, String>();
		param.put("appid", PayConfig.appid); // 公众号的唯一标识
		param.put("mch_id", PayConfig.partner); //商户的账号
		param.put("out_trade_no",orderId); // 订单号
		param.put("nonce_str", WXPayUtil.generateNonceStr()); //随机字符串
		// 数字签名与把上面参数写成xml格式
		String xml = WXPayUtil.generateSignedXml(param, PayConfig.partnerkey);
		// 把信息发送给微信支付后台，查询订单状态
		HttpClient client  = new HttpClient(WXPayConstants.DOMAIN_API+WXPayConstants.ORDERQUERY_URL_SUFFIX);
		client.setHttps(true);//开启https协议
		client.setXmlParam(xml);//设置xml格式的数据
		
		long startTime = System.currentTimeMillis(); //定义一个变量记录开始发送请求的时间
		// 可以写一个while，一直查询，直到查询支付成功，然后发送json。最后jsp页面在进行跳转。
		while (true) {
			client.post();//发送请求
			// 获取微信支付的返回值。
			String content = client.getContent();
			// 把XML转换map对象
			Map<String, String> resultMap = WXPayUtil.xmlToMap(content);
			// 把map转换成json向页面输出
			String json = FastJsonUtil.toJSONString(resultMap);
			// 情况一；用户已经支付，
			if ("success".equalsIgnoreCase(resultMap.get("trade_state"))) {
				FastJsonUtil.write_json(response, json);
			}
			// 情况二，超过了30秒，用户还是没有支付
			if (System.currentTimeMillis()-startTime>30000) {
				FastJsonUtil.write_json(response, json);  // trade_state=NOTPAY
				break;
			}
			Thread.sleep(3000);
		
		}
		
		
	}
	
}
