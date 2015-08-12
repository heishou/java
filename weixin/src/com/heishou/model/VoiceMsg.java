package com.heishou.model;

/**
 * 语音消息
 * @author heishou
 *
 */
public class VoiceMsg {
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
	 * 消息类型,语音为voice
	 */
    private String MsgType;
    /**
	 * 语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
    private String MediaId;
    /**
	 * 语音格式，如amr，speex等
	 */
    private String Format;
    /**
	 * 消息id，64位整型
	 */
    private String MsgID;
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
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public String getMsgID() {
		return MsgID;
	}
	public void setMsgID(String msgID) {
		MsgID = msgID;
	}
    
}
