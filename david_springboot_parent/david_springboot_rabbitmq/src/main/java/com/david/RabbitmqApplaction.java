package com.david;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 介绍rabbitmq的使用
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 * 
 * 
 * 
 * rabbitmq端口号：
 4369 (epmd), 25672 (Erlang distribution)
5672, 5671 (AMQP 0-9-1 without and with TLS)
15672 (if management plugin is enabled)
61613, 61614 (if STOMP is enabled)
1883, 8883 (if MQTT is enabled)
 * 输入命令

1
rabbitmq-plugins enable rabbitmq_management
3.在启用插件成功后回看到一些提示信息，然后就可以通过 http://server-name:15672
访问了，默认用户名称和密码为guest,guest，进入管理页面后，我们可以看到几个大的Tab，这个和RabbitMQ也某种意义上反应了RabbitMQ的整体架构，在这就不详细阐述了。

 */

@SpringBootApplication
@RestController // @Controller @ResponseBody
public class RabbitmqApplaction {

	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(RabbitmqApplaction.class, args);
	    }
	

}
