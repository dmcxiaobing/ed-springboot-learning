package com.david.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JettyController {

	@RequestMapping("/writeTest")
	public void writeTest( HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 解决输出中文乱码。
		request.setCharacterEncoding("utf-8"); // 1
		response.setContentType("text/html;charset=utf-8"); // 2
		response.setCharacterEncoding("utf-8"); // 3
		PrintWriter out = response.getWriter();
		out.println("你好，jetty");
		out.flush();
		out.close();
	}
}
