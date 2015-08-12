package com.heishou.model;
/**
 * 微信文本消息对象
 * @author heishou
 *
 */
public class TextMsg {
	/**
	 * 开发者微信号
	 */
    private String ToUserName;
    /**
	 * 发送者
	 */
    private String FromUserName;
    /**
	 * 时间
	 */
    private String CreateTime;
    /**
	 * 消息类型
	 */
    private String MsgType;
    /**
	 * 消息内容
	 */
    private String Content;
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
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
    
}
