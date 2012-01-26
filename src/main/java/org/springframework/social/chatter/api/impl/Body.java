
package org.springframework.social.chatter.api.impl;

import java.util.List;

public class Body{
   	private List<MessageSegments> messageSegments;
   	private String text;

 	public List<MessageSegments> getMessageSegments(){
		return this.messageSegments;
	}
	public void setMessageSegments(List<MessageSegments> messageSegments){
		this.messageSegments = messageSegments;
	}
 	public String getText(){
		return this.text;
	}
	public void setText(String text){
		this.text = text;
	}
}
