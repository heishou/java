package com.heishou.message;

import com.heishou.enums.*;
/**
 * 微信端图片消息对象
 * 
 * @author heishou
 * 
 */
public class ImageMsg extends Msg{
	public ImageMsg() {
		setMsgType(MsgType.image);
	}
	/**
	 * 图片链接
	 */
	public String PicUrl;
	/**
	 * 图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String MediaId;
	
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
}
