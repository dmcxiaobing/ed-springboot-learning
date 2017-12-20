package com.david.edspringbootjpa.aspect;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * aop介绍。简单使用 Pointcut is malformed: Pointcut is not well-formed: expecting ')'
 * at character position 16 exection(public *
 * com.david.edspringbootjpa.controller.UserController.*(..)) ^ 错误请看代码。
 * 
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
// 面向切面编程
@Aspect
@Component
public class HttpAspect {

	private final static Logger logger = org.slf4j.LoggerFactory.getLogger(HttpAspect.class);

	/**
	 * 配置切入点
	 */
	@Pointcut(value = "execution(public * com.david.edspringbootjpa.controller.UserController.*(..))")
	public void log() {

	}

	/**
	 * 在执行切入点的方法之前执行
	 */
	@Before("HttpAspect.log()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		// 得到request对象
		HttpServletRequest request = attributes.getRequest();

		// 输入请求的url http://localhost:8082/list
		logger.info("url={}", request.getRequestURL());
		// 获取请求的方法 method=GET
		logger.info("method={}", request.getMethod());
		// 获取ip
		logger.info("ip{}", request.getRemoteAddr());
		// 获取类方法 com.david.edspringbootjpa.controller.UserController.getList
		logger.info("class_method={}",
				joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
		// 获取参数 args={} 为空证明没有传参
		logger.info("args={}", joinPoint.getArgs());

	}

	/**
	 * 在执行切入点的方法之后执行
	 */
	@After("log()")
	public void doAfter() {
		logger.info("messagedoAfter");
	}

	/**
	 * 可以查看到响应给客户端的数据
	 * 
	 * @param object
	 */
	@AfterReturning(returning = "object", pointcut = "log()")
	public void doAfterReturning(Object object) {
		// 这里直接故意报空指针异常
		if (object!=null) {
			object = null;
		}
		logger.info("response={}", object.toString());
	}
}
