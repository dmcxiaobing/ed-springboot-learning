package com.david.edspringbootgradle.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Configuration
//post  templates
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	/**
	 * 使用jdbc认证方式，密码采用BCrypt加密，salt 10
	$2a$10$OB3Ni.NElsl5i1q6Acj8sOBAoMtoM3wmHjubaX/CZrddC5y5wfQje
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder(10));
	}
	
	
	/**
	 * 客户端使用API登陆
	 */
	@Order(1)
	@Configuration
	public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter{
		protected void configure(HttpSecurity httpSecurity)throws Exception {
			httpSecurity.antMatcher("/api/v1/i/**")// 带有“i”的目录都需要认证或提供token
			.authorizeRequests().anyRequest().hasRole("USER").and().httpBasic().and().csrf().disable()
			.sessionManagement().maximumSessions(1).expiredUrl("/api/sessionExpired"); // 每个用户只有一个有效会话，第二个设备登录就挤掉前面一个
		}
	}
	
	/**
	 * Web Form表单登录
	 * 
	 */
	@Configuration
	@Order(2)
	public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			System.out.println("表单验证");
			http.authorizeRequests()
					.antMatchers("/api/create", "/", "/assets/**", "/plugins/**", "/static/**", "/bootstrap/**",
							"/v2/api-docs/**", "/swagger-ui.html**", "/webjars/**", "/swagger-resources/**", "/api/**") // 免认证目录
					.permitAll().antMatchers("/admin/**").hasRole("ADMIN")// ADMIN角色可以访问/admin目录
					.anyRequest().authenticated().and().formLogin().loginPage("/login")// 自定义登录页为/login
					.permitAll().and().logout().permitAll().and().csrf().disable();
		}
	}
	
}

