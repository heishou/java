package com.heishou.enums;

/**
 * 微信端消息类型,避免手写错误和方便后期维护
 * @author heishou
 * 
 */
public enum MsgType {
	/**
	 * 文本
	 */
	text("text"), 
	/**
	 * 图片
	 */
	image("image"), 
	/**
	 * 语音
	 */
	voice("voice"), 
	/**
	 * 普通视频
	 */
	video("video"), 
	/**
	 * 短视频
	 */
	shortvideo("shortvideo"), 
	/**
	 * 位置
	 */
	location("location"), 
	/**
	 * 链接
	 */
	link("link");
	
	private MsgType(String value){
		this.value=value;
	}
    private String value;

    /**
     * 重写toString()返回枚举值为字符串
     */
    @Override
    public String toString() {
    	return value;
    }
}
