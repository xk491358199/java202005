package com.qa.springboot.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

			// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
			public static String app_id = "2021000116663412";
			
			// 商户私钥，您的PKCS8格式RSA2私钥
			public static String merchant_private_key ="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";
			// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
			public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgfIhoL+DevbCPME+kwUV2qgqGAyu12j/WgcUTRLCNP2NBD/LJb185w469zDgn6nYBQ9MqpMEInoEI/wpEvd7cxPSSsZOQXYhm6hl+q1ZgpBcgQi5xXbNJgbj+Fz8j7RR4S4Aj6Ygh4ZSr2AamuvXylX3NorfpZSgNkt7Eb5WpxhUPg7c7ALanLqCFJG2zsXpmgvwtpCrVhS5tdwnz+yA/g3qp8b7ac9PK7SLeyexTl0xnCUVk4K4gdPfzFZ9sU5mciThNnMffhElOp+rHBjR8CihrfkDqp3CSqXZ3z/yzhGBiQSi/Z+Uu20N5/5oBqCLykj6sR1qEx4acId7HA2m4QIDAQAB/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
			// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
			public static String notify_url = "http://localhost:8080/";

			// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
			public static String return_url = "http://localhost:8080/";

			// 签名方式
			public static String sign_type = "RSA2";
			
			// 字符编码格式
			public static String charset = "utf-8";
			
			// 支付宝网关
			public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
			
			// 支付宝网关
			public static String log_path = "C:\\";


		//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

		    /** 
		     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
		     * @param sWord 要写入日志里的文本内容
		     */
		    public static void logResult(String sWord) {
		        FileWriter writer = null;
		        try {
		            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
		            writer.write(sWord);
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            if (writer != null) {
		                try {
		                    writer.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }
		        }
		    }
}
