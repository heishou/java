package com.heishou.weixin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heishou.util.WeixinHelper;

public class WeixinServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public WeixinServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setContentType("text/html");
        //接收微信请求的四个参数
		String signature=request.getParameter("signature");
		String timestamp=request.getParameter("timestamp");
		String nonce=request.getParameter("nonce");
		String echostr=request.getParameter("echostr");
		PrintWriter out=response.getWriter();
		//拼接加密比较
		if (WeixinHelper.CheckSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
