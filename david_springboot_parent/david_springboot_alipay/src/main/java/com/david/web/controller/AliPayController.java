package com.david.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayOpenPublicTemplateMessageIndustryModifyRequest;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayOpenPublicTemplateMessageIndustryModifyResponse;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.david.constants.AliPayConstant;
import com.david.utils.JsonUtils;

/**
 * 支付宝支付controller
 * 
 * @author ：david
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@RestController
public class AliPayController {

	/**
	 * 生成订单信息 支付宝支付，APP调用，返回给APP端 支付串
	 */
	@RequestMapping("/appGetAlipay")
	public String appGetAlipay(HttpServletResponse response) throws IOException {
		// 实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient(AliPayConstant.ALIPAY_URL, AliPayConstant.APPID,
				AliPayConstant.RSA_PRIVATE, "json", "utf-8", AliPayConstant.RSA_PUBLIC, "RSA2");
		// 实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		// SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
		// 设置详情信息
		model.setBody("我是测试数据");
		// 设置商品标题
		model.setSubject("App支付测试Java");
		// 设置订单号
		model.setOutTradeNo("1234567899");
		model.setTimeoutExpress("30m");
		// 设置价格
		model.setTotalAmount("0.01");
		model.setProductCode("QUICK_MSECURITY_PAY");
		request.setBizModel(model);
		request.setNotifyUrl(AliPayConstant.ALIPAY_CALLBACK_URL);
		try {
			// 这里和普通的接口调用不同，使用的是sdkExecute
			AlipayTradeAppPayResponse payResponse = alipayClient.sdkExecute(request);
			System.out.println(payResponse.getBody());// 就是orderString 可以直接给客户端请求，无需再做处理。
			String payString = payResponse.getBody();
			// response.getWriter().write(payString);;
			return payString;
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 支付宝，支付结果回调地址。URL
	 */
	@RequestMapping("/notifyAliPayUrl")
	public String notifyAliPayUrl(HttpServletRequest request) throws Exception {
		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		// 切记alipaypublickey是支付宝的公钥，请去open.alipay.com对应应用下查看。
		// boolean AlipaySignature.rsaCheckV1(Map<String, String> params, String
		// publicKey, String charset, String sign_type)
		boolean flag = AlipaySignature.rsaCheckV1(params, AliPayConstant.RSA_PUBLIC, "utf-8", "RSA2");
		if (flag) {
			return "success";
		}
		return null;

	}


}
