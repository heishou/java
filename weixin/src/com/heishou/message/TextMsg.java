package com.heishou.message;

import com.heishou.enums.MsgType;

/**
 * 微信文本消息对象text
 * @author heishou
 *
 */
public class TextMsg extends Msg {
    public TextMsg() {
        setMsgType(MsgType.text);
	}

	/**
	 * 文本消息内容
	 */
    private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
    
}
