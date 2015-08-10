package com.heishou.util;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public  class WeixinHelper {
	private static final String token = "heishou";

	public static boolean CheckSignature(String signature, String timestamp,
			String nonce) {
		// 排序
		String[] arr = new String[] { signature, timestamp, nonce };
		Arrays.sort(arr);
		// 拼接
		String str ="";
		for (int i = 0; i < arr.length; i++) {
			str+=arr[i];
		}
		System.out.println("加密前:" + str);
		str=Encrypt(str,"SHA-1");
		System.out.println("加密后:"+str);
        
		return str.equals(signature);
	}
    
	
	//sha1加密
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
  
	
	
}