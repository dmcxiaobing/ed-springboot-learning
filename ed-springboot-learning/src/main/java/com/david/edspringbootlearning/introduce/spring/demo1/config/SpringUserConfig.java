package com.david.edspringbootlearning.introduce.spring.demo1.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.david.edspringbootlearning.introduce.spring.demo1.dao.UserDao;
import com.jolbox.bonecp.BoneCPDataSource;

/**
 * spring在Java中的一些配置介绍
 * 
 * @author ：david
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
// 通过该注解来表名此类是一个spring的配置。相当于一个XML
@Configuration
// 配置扫描包。扫描整个demo1.因为有service，所以不能配置到config目录下
@ComponentScan(basePackages = "com.david.edspringbootlearning.introduce.spring.demo1")
// 配置扫描资源文件
@PropertySource(value = { "classpath:jdbc.properties" }, ignoreResourceNotFound = true)
public class SpringUserConfig {
	// 通过该注解来说明式一个Bean对象。相当于XML中的<bean>
	@Bean
	public UserDao getUserDao() {
		return new UserDao(); // 直接new对象做演示
	}

	/**
	 * 得到jdbc资源中的值
	 */
	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Value("${jdbc.driverClassName}")
	private String jdbcDriverClassName;

	@Value("${jdbc.username}")
	private String jdbcUsername;

	@Value("${jdbc.password}")
	private String jdbcPassword;
	// 调用关闭的时候，进行关闭
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
		// 数据库驱动
		boneCPDataSource.setDriverClass(jdbcDriverClassName);
		// 相应驱动的jdbcUrl
		boneCPDataSource.setJdbcUrl(jdbcUrl);
		// 数据库的用户名
		boneCPDataSource.setUsername(jdbcUsername);
		// 数据库的密码
		boneCPDataSource.setPassword(jdbcUsername);
		// 检查数据库连接池中空闲连接的间隔时间，单位是分，默认值：240，如果要取消则设置为0
		boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
		// 连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要永远存活设置为0
		boneCPDataSource.setIdleMaxAgeInMinutes(30);
		// 每个分区最大的连接数
		boneCPDataSource.setMaxConnectionsPerPartition(100);
		// 每个分区最小的连接数
		boneCPDataSource.setMinConnectionsPerPartition(5);
		return boneCPDataSource;
	}
}
