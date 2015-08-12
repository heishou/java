package com.heishou.message;

import com.heishou.enums.*;
/**
 * 微信消息对象通用
 * @author heishou
 *
 */
public class Msg {
	/**
	 * 开发者微信号
	 */
    private String ToUserName;
    /**
	 * 发送方帐号（一个OpenID）
	 */
    private String FromUserName;
    /**
	 * 消息创建时间
	 */
    private String CreateTime;
    /**
	 * 消息类型默认已初始化 不需设置
	 */
    private String MsgType;
    /**
	 * 消息id
	 */
    private String MsgId;
    
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	/**
	 * 默认已初始化 不需设置
	 * @param msgType
	 */
	public void setMsgType(MsgType msgType) {
		MsgType = msgType.toString();
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
}
