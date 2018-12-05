package com.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 *
 * mvn mybatis-generator:generate 生成mapper和实体类。
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.david.mapper")
@ComponentScan(basePackages = {"com.david"})
public class SqlserverDmybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqlserverDmybatisApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "redirect:countries";
    }
}
