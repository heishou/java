package com.heishou.weixin;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.heishou.util.TextMsg;
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
		//接收消息
        Map<String, String> messageMap=WeixinHelper.xmlToMap(request);
        //文本类型
        String MsgType=messageMap.get("MsgType");
        //接收方账号
        String ToUserName=messageMap.get("ToUserName");
        //发送方账号
        String FromUserName=messageMap.get("FromUserName");
        String Content=messageMap.get("Content");
        //如果接收的是文本类型内容，就回应消息发送方，此时身份对换
        if ("text".equals(MsgType)) {
    		//保存在文本对象
            TextMsg textMessage=new TextMsg();
            textMessage.setFromUserName(ToUserName);
            textMessage.setToUserName(FromUserName);
            textMessage.setMsgType("text");
            textMessage.setContent("您发送的消息是"+Content);
            //这里就需要把文本消息对象转换成xml并返回给微信服务端
            
		}
        
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
