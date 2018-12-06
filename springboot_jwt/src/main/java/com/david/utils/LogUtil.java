package com.david.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author ：David
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
/**
 * 简单使用log4j
 */
public class LogUtil {
    //创建日志对象
    private static Logger log = LoggerFactory.getLogger(LogUtil.class);

    public static void I(String messge){
        log.info(messge);
    }

    public static void i(String messge){
        log.info(messge);
    }

    public static void E(String messge,Exception e){
        log.error(messge,e);
    }

    public static void e(String messge){
        log.error(messge);
    }

    public static void D(String messge){
        log.debug(messge);
    }

    public static void d(String messge){
        log.debug(messge);
    }

    public static void w(String messge){
        log.warn(messge);
    }

    public static void W(String messge){
        log.warn(messge);
    }
}
