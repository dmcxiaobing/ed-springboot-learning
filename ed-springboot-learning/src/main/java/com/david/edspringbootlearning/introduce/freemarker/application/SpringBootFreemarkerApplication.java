package com.david.edspringbootlearning.introduce.freemarker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.david.edspringbootlearning.EdSpringbootLearningApplication;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.david.edspringbootlearning"})
public class SpringBootFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFreemarkerApplication.class, args);

	}
}
