package com.david.config;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/*
 * 增加回调处理的配置信息
 */
@Configuration
public class SendConfig implements RabbitTemplate.ConfirmCallback {  
  
    private static final Logger LOGGER = LoggerFactory.getLogger(SendConfig.class);  
  
    private RabbitTemplate rabbitTemplate;  
    /**
     * 构造方法注入
     */
    @Autowired  
    public SendConfig(RabbitTemplate rabbitTemplate) {  
        this.rabbitTemplate = rabbitTemplate;  
        this.rabbitTemplate.setConfirmCallback(this);  
    }  
  
    public void send(String msg) {  
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());  
        LOGGER.info("send: " + correlationData.getId());  
        this.rabbitTemplate.convertAndSend(AmqpConfig.FOO_EXCHANGE, AmqpConfig.FOO_ROUTINGKEY, msg, correlationData);  
    }  
  
    /** 回调方法 */  
    @Override  
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {  
        LOGGER.info("confirm: " + correlationData.getId());  
    }  
}  