package com.david.edspringbootlearning.introduce.spring.demo1.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.david.edspringbootlearning.introduce.spring.demo1.config.SpringUserConfig;
import com.david.edspringbootlearning.introduce.spring.demo1.model.User;
import com.david.edspringbootlearning.introduce.spring.demo1.service.UserService;


/**
 * 测试spring的Java配置
 * 
 * @author ：david
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class TestSpring {
	@Test
	public void test() {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringUserConfig.class);
        
        // 在Spring容器中获取Bean对象
        UserService userService = context.getBean(UserService.class);
        
        // 调用对象中的方法
        List<User> list = userService.queryList();
        for (User user : list) {
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPassword());
        }
        
        // 销毁该容器
        context.destroy();
	}
}
