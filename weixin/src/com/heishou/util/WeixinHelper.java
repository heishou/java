package com.heishou.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.heishou.message.ImageMsg;
import com.heishou.message.TextMsg;
import com.thoughtworks.xstream.XStream;

public class WeixinHelper {
	private static final String token = "heishou";

	public static boolean CheckSignature(String signature, String timestamp,
			String nonce) {
		// 排序
		String[] arr = new String[] { token, timestamp, nonce };
		Arrays.sort(arr);
		// 拼接
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		System.out.println(signature);
		System.out.println("加密前:" + str);
		str = Encrypt(str, "SHA-1");
		System.out.println("加密后:" + str);

		return str.equals(signature);
	}

	// sha1加密
	public static String Encrypt(String strSrc, String encName) {
		MessageDigest md = null;
		String strDes = null;

		byte[] bt = strSrc.getBytes();
		try {
			if (encName == null || encName.equals("")) {
				encName = "MD5";
			}
			md = MessageDigest.getInstance(encName);
			md.update(bt);
			strDes = bytes2Hex(md.digest()); // to HexString
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Invalid algorithm.");
			return null;
		}
		return strDes;
	}

	public static String bytes2Hex(byte[] bts) {
		String des = "";
		String tmp = null;
		for (int i = 0; i < bts.length; i++) {
			tmp = (Integer.toHexString(bts[i] & 0xFF));
			if (tmp.length() == 1) {
				des += "0";
			}
			des += tmp;
		}
		return des;
	}
    
	/**
	 * 把xml消息请求转换为map
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	public static Map<String, String> xmlToMap(HttpServletRequest request) throws IOException {
		Map<String, String> hMap=new HashMap<String,String>();
		SAXReader sReader=new SAXReader();
		//获取输入流
		InputStream iStream=request.getInputStream();
		try {
			Document document=sReader.read(iStream);
			//获取xml的根节点
			Element element=document.getRootElement();
			//所有子节点
			List<Element> ee=element.elements();
			for (Element element2 : ee) {
				hMap.put(element2.getName(),element2.getText());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}finally{
			iStream.close();
		}
		return hMap;
	}
	
	
	/**
	 * 文本消息对象转换成w文本消息xml
	 * @param xm
	 * @return
	 */
//	public static String messageToXML(TextMsg xm){
//		XStream xStream=new XStream();
//		xStream.toXML(xm);
//	}
}
