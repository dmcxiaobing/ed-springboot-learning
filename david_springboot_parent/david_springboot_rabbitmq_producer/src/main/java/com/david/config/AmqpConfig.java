package com.david.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;

/**
 * rabbitmq的一些配置。这个地址也是引用application.properties中的配置信息。
 * 
 */
@Configuration
public class AmqpConfig {
	public static final String FOO_EXCHANGE   = "callback.exchange.foo";  
    public static final String FOO_ROUTINGKEY = "callback.routingkey.foo";  
    public static final String FOO_QUEUE      = "callback.queue.foo";  
  
    @Value("${spring.rabbitmq.host}")  
    private String addresses;  
    @Value("${spring.rabbitmq.username}")  
    private String username;  
    @Value("${spring.rabbitmq.password}")  
    private String password;  
    @Value("${spring.rabbitmq.virtual-host}")  
    private String virtualHost;  
    @Value("${spring.rabbitmq.publisher-confirms}")  
    private boolean publisherConfirms;  
    private static final Logger LOGGER = LoggerFactory.getLogger(AmqpConfig.class);  

    @Bean  
    public org.springframework.amqp.rabbit.connection.ConnectionFactory connectionFactory() {  
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();  
        connectionFactory.setAddresses(addresses);  
        connectionFactory.setUsername(username);  
        connectionFactory.setPassword(password);  
        connectionFactory.setVirtualHost(virtualHost);  
        /** 如果要进行消息回调，则这里必须要设置为true */  
        connectionFactory.setPublisherConfirms(publisherConfirms);  
        return connectionFactory;  
    }  
  
    @Bean  
    /** 因为要设置回调类，所以应是prototype类型，如果是singleton类型，则回调类为最后一次设置 */  
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
    public RabbitTemplate rabbitTemplate() {  
        RabbitTemplate template = new RabbitTemplate(connectionFactory());  
        return template;  
    }  
    
}