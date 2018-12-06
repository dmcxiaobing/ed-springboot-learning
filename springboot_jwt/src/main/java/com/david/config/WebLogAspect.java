package com.david.config;

import com.david.utils.DavidLogUtil;
import com.david.utils.FastJsonUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author ：David
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */

/**
 * 统一日志处理
 */
@Aspect
@Component
public class WebLogAspect {


    @Pointcut("execution(* com.david.web.controller..*.*(..))")
    public void webLog() {
    }


    @Before("webLog()")
    public void before(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg == null || arg instanceof HttpServletRequest || arg instanceof HttpServletResponse) {
                continue;
            }
            try {
                DavidLogUtil.i("请求参数为:" + FastJsonUtil.toJSONString(arg));
            } catch (Exception e) {
                continue;
            }

        }
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void afterReturn(Object ret) throws Throwable {
        DavidLogUtil.i("响应结果为:" + FastJsonUtil.toJSONString(ret));
        MDC.clear();
    }
}
