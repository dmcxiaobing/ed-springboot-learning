package com.david.utils;

/**
 * @author ：David
 * @weibo ：https://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单使用log4j...用来测试流程，请不要用此类
 */
public class DavidLogUtil {
    //创建日志对象
    private static Logger monitorLogger = LoggerFactory.getLogger("david_log_monitor");


    public static void I(String messge) {
        monitorLogger.info(messge);
        LogUtil.i(messge);
    }

    public static void i(String messge) {
        monitorLogger.info(messge);
        LogUtil.i(messge);
    }

    public static void E(String messge, Exception e) {
        monitorLogger.error(messge, e);
    }

    public static void e(String messge) {
        monitorLogger.error(messge);
    }

    public static void D(String messge) {
        monitorLogger.debug(messge);
    }

    public static void d(String messge) {
        monitorLogger.debug(messge);
    }

    public static void w(String messge) {
        monitorLogger.warn(messge);
    }

    public static void W(String messge) {
        monitorLogger.warn(messge);
    }
}
