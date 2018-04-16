package com.david.utils;

import java.util.Map;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.david.entity.ResponseEntity;

public class RsaUtil {
	/**
	 * PKCS8格式的私钥
	 */
	public static final String clientPrivateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKbNojYr8KlqKD/y"
			+ "COd7QXu3e4TsrHd4sz3XgDYWEZZgYqIjVDcpcnlztwomgjMj9xSxdpyCc85GOGa0"
			+ "lva1fNZpG6KXYS1xuFa9G7FRbaACoCL31TRv8t4TNkfQhQ7e2S7ZktqyUePWYLlz"
			+ "u8hx5jXdriErRIx1jWK1q1NeEd3NAgMBAAECgYAws7Ob+4JeBLfRy9pbs/ovpCf1"
			+ "bKEClQRIlyZBJHpoHKZPzt7k6D4bRfT4irvTMLoQmawXEGO9o3UOT8YQLHdRLitW"
			+ "1CYKLy8k8ycyNpB/1L2vP+kHDzmM6Pr0IvkFgnbIFQmXeS5NBV+xOdlAYzuPFkCy"
			+ "fUSOKdmt3F/Pbf9EhQJBANrF5Uaxmk7qGXfRV7tCT+f27eAWtYi2h/gJenLrmtke"
			+ "Hg7SkgDiYHErJDns85va4cnhaAzAI1eSIHVaXh3JGXcCQQDDL9ns78LNDr/QuHN9"
			+ "pmeDdlQfikeDKzW8dMcUIqGVX4WQJMptviZuf3cMvgm9+hDTVLvSePdTlA9YSCF4"
			+ "VNPbAkEAvbe54XlpCKBIX7iiLRkPdGiV1qu614j7FqUZlAkvKrPMeywuQygNXHZ+"
			+ "HuGWTIUfItQfSFdjDrEBBuPMFGZtdwJAV5N3xyyIjfMJM4AfKYhpN333HrOvhHX1"
			+ "xVnsHOew8lGKnvMy9Gx11+xPISN/QYMa24dQQo5OAm0TOXwbsF73MwJAHzqaKZPs"
			+ "EN08JunWDOKs3ZS+92maJIm1YGdYf5ipB8/Bm3wElnJsCiAeRqYKmPpAMlCZ5x+Z" + "AsuC1sjcp2r7xw==";

	public static final String clientPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCmzaI2K/Cpaig/8gjne0F7t3uE"
			+ "7Kx3eLM914A2FhGWYGKiI1Q3KXJ5c7cKJoIzI/cUsXacgnPORjhmtJb2tXzWaRui"
			+ "l2EtcbhWvRuxUW2gAqAi99U0b/LeEzZH0IUO3tku2ZLaslHj1mC5c7vIceY13a4h" + "K0SMdY1itatTXhHdzQIDAQAB";

	public static final String serverPrivateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALIZ98KqgLW8IMt4"
			+ "G+N+4d3DiOiEa+5s6lCMSGE/NbU9stJEqw0EuCP54MY6JkT0HCYTCrLXqww6rSQy"
			+ "WF7BNCVGssk2XDcvSKiCz1ZMgabd6XVK5kvIycySydXQ0Ky6rnfxw8w2mllHABFv"
			+ "s1eamaHQozv18n/XGqemjW2BFy/jAgMBAAECgYAxT3FCi3SBXKnzy7hk/z9H6Bhi"
			+ "0C8V3z/stzpe+mJDYOa+wtZdD15wT4HFQFpSIwgcHo+Kvp2UEDbZ27qN2Y43AZbF"
			+ "9LOalWTRUzYtr8wL8MIbgtew/QQ9YFNWdkTZ6MxCItjD/mSz3Lrkcphvbsx4VoCV"
			+ "YIJ04r+Loi0t9g0guQJBANvkpfrq0bLVRYWfaigjkx47mr0trJkB7mjADe69Iqts"
			+ "M/2x5dHPpClDK78yzAWxU2BrYzOd31QIOm32iMIvRxUCQQDPWJPMOzcq8Jqs1PAM"
			+ "7D0hxnvF3tSJB0CJCQWdGFkJiuIYSbrWnCVF78jJyU2AK1H3RDi9BzGPL2Z3i2Si"
			+ "+9kXAkAPnKtAJl3fEY9PDmNuGCCA3AB/f/eqIV345/HVSm5kt1j1oSTNAa4JE/DO"
			+ "MWAU42MlDFrNtl69y5vCZOeOyeaFAkBOJieGmWcAozDZJWTYqg2cdk/eU08t2nLj"
			+ "c2gPPscIRrVSzC9EhhOyWV8HVv0D6s/471inPlfajNYFBp/Goj+/AkEAiejHX/58"
			+ "Vv8+ccW22RMZmyxiHcZpTw9hz7vHUCWv03+fyVGtGMhJ4xuPt8UaZm91yHSPWWar" + "M8Xa7errKaXN9A==";
	public static final String serverPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCyGffCqoC1vCDLeBvjfuHdw4jo"
			+ "hGvubOpQjEhhPzW1PbLSRKsNBLgj+eDGOiZE9BwmEwqy16sMOq0kMlhewTQlRrLJ"
			+ "Nlw3L0iogs9WTIGm3el1SuZLyMnMksnV0NCsuq538cPMNppZRwARb7NXmpmh0KM7" + "9fJ/1xqnpo1tgRcv4wIDAQAB";

	/**
	 * 服务端响应数据(加密之后)
	 * aesKey 随机生成AES密钥
	 */
	public static String serverResponseData(ResponseEntity entity,String aesKey) throws Exception {
		Map<String, Object> map = CommonUtils.transBean2Map(entity);

		TreeMap<String, Object> params = new TreeMap<String, Object>();
		for (String key : map.keySet()) {
			params.put(key, map.get(key));
		}

		// 生成RSA签名
		String sign = EncryUtil.handleRSA(params, serverPrivateKey);
		params.put("sign", sign);

		String info = JSON.toJSONString(params);
		
		// AES加密数据
		String data = AES.encryptToBase64(info, aesKey);

		return data;
	}
	
	/**
	 * 返回加密签名秘钥
	 */
	public static String serverResponseEncryptKey(String aesKey) throws Exception {
		// 使用RSA算法将商户自己随机生成的AESkey加密
		String encryptkey = RSA.encrypt(aesKey, clientPublicKey);
		return encryptkey;
	}
	

	/**
	 * 客户端解析服务端加密的信息
	 * 
	 * @throws Exception
	 */
	public static String clientDecode(String data, String encrypt_key) throws Exception {
		System.out.println("data:"+data);
		System.out.println("encrypt_key:"+encrypt_key);
		// 验签
		boolean passSign = EncryUtil.checkDecryptAndSign(data, encrypt_key, serverPublicKey, clientPrivateKey);

		if (passSign) {
			// 验签通过
			String aeskey = RSA.decrypt(encrypt_key, clientPrivateKey);
			data = AES.decryptFromBase64(data, aeskey);
			System.out.println("解密后的数据是:" + data);
			// 可以进行json解析。
			return data;
//			JSONObject jsonObj = JSONObject.parseObject(data);
//			String userid = jsonObj.getString("userid");
//			String phone = jsonObj.getString("phone");
//			System.out.println("客户端解密后的明文:userid:" + userid + " phone:" + phone);

		} else {
			System.out.println("验签失败");
			return null;
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		String data = "iKpmjvyqwaPqwkfhJ9M7cmDaxQBLOGbadd2gkzGt5DbF8SoDmbbGZMVhR8S8Tii/As2XRMBItkYvqF/hEr8N9q2Rdbp3Bn/47uiOfrYpSHqFFLisPGf0sN+z0s51Iidczn/uTMQo3uzRds9bdPBhOeP0o1heivh7CWUAFd2QxwZDwjkqYyxL7O71vj4LvQIUdhy6jHSAfyaxL8EgOoC8IedgM26ovwlLQBMA9zJRGpvg6BsAd/xRycJElrURLa0PZzYnXXymRkMMWLppISEpMBPb0DUQhYD2r8wRUjUXTrYzkMEpGfpzr/8cBhkmCW0w";
		String key = "ZUqf4MCw3l7Ek2Ert+hNEHHOZWauYnMmhkilNfzoQIC75u9YjleHVPIzwIMDeJedU46VA4GPl8EXI5DN70vji72d/saXdYNYnPnluTuQgrhbvW4K3vJ0w5rrNsRcP9HspgJGQNSPcnvFLAl13RQDcXbD/pboPq3z9ZJb8Ogn6oY=";
		String decodeResult = RsaUtil.clientDecode(data,key);
	
	}


	
	/**
	 * 设置默认的数据.未加密的数据
	 */
	public static void setDefaultRsa(ResponseEntity entity) {
		// 504表示 未签名加密的数据
		entity.setCode(504);
		entity.setData("data is not sign");
		entity.setAesKey("no aes key");
	}

	/**
	 * 设置加密的数据.
	 */
	public static void setSignRsa(ResponseEntity entity, int code, String dataRSA, String aesKeyRSA) {
		// 504表示 未签名加密的数据
		entity.setCode(code);
		entity.setData(dataRSA);
		entity.setAesKey(aesKeyRSA);
	}
	
	
}
