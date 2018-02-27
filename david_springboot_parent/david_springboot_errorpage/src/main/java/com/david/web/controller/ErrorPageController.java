package com.david.web.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.ShellProperties.Telnet;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * 错误页面进行转发演示controller
 * 
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
@Controller
@RequestMapping("/error")
@EnableConfigurationProperties({ ServerProperties.class })
public class ErrorPageController implements ErrorController {

	private ErrorAttributes errorAttributes;
	/**
	 * 注入ServerProperties
	 */
	@Autowired
	private ServerProperties serverProperties;

	/**
	 * 初始化ExceptionController
	 *
	 * @param errorAttributes
	 */
	@Autowired
	public ErrorPageController(ErrorAttributes errorAttributes) {
		// 如果为空则抛出异常，否则赋值。
		Assert.notNull(errorAttributes, "ErrorAttributes must not be null");
		this.errorAttributes = errorAttributes;
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @RequestMapping(value = "/produces", produces =
	 *                       "application/json")：表示将功能处理方法将生产json格式的数据，此时根据请求头中的Accept进行匹配，如请求头“Accept:application/json”时即可匹配;
	 * @RequestMapping(value = "/produces", produces =
	 *                       "application/xml")：表示将功能处理方法将生产xml格式的数据，此时根据请求头中的Accept进行匹配，如请求头“Accept:application/xml”时即可匹配。
	 */
	/*
	 * 定义404的返回页面 produces:返回结果类型 value:请求的路径
	 */
	@RequestMapping(produces = "text/html", value = "404")
	public ModelAndView errorHtml404(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(this.getStatus(request).value());
		Map<String, Object> model = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.TEXT_HTML));
		 System.err.println("400ErrorController");
		return new ModelAndView("error/404", model);
	}

	
	
	  /**
     * 定义400的返回页面
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(produces = "text/html", value = "400")
    public ModelAndView errorHtml400(HttpServletRequest request,
                                     HttpServletResponse response) {
        response.setStatus(getStatus(request).value());
        Map<String, Object> model = getErrorAttributes(request,
                isIncludeStackTrace(request, MediaType.TEXT_HTML));
        return new ModelAndView("error/400", model);
    }

    /**
     * 定义500的返回页面
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(produces = "text/html", value = "500")
    public ModelAndView errorHtml500(HttpServletRequest request,
                                     HttpServletResponse response) {
        response.setStatus(getStatus(request).value());
        Map<String, Object> model = getErrorAttributes(request,
                isIncludeStackTrace(request, MediaType.TEXT_HTML));
        System.err.println("500ErrorController");
        return new ModelAndView("error/500", model);
    }

	
	private boolean isIncludeStackTrace(HttpServletRequest request, MediaType textHtml) {
		ErrorProperties.IncludeStacktrace include = this.serverProperties.getError().getIncludeStacktrace();
		if (include == ErrorProperties.IncludeStacktrace.ALWAYS) {
			return true;
		}
		if (include == ErrorProperties.IncludeStacktrace.ON_TRACE_PARAM) {
			return getTraceParameter(request);
		}
		return false;
	}

	
	
	
	/**
     * 是否包含trace
     *
     * @param request
     * @return
     */
    private boolean getTraceParameter(HttpServletRequest request) {
        String parameter = request.getParameter("trace");
        if (parameter == null) {
            return false;
        }
        return !"false".equals(parameter.toLowerCase());
    }
	
	/**
	 * 获取错误的信息
	 * 
	 * @return
	 */
	private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return this.errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
	}

	/**
	 * 获取 错误 编号
	 */
	private HttpStatus getStatus(HttpServletRequest request) {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		if (statusCode == null) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
		try {
			return HttpStatus.valueOf(statusCode);
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}

}
