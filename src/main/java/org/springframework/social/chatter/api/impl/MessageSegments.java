
package org.springframework.social.chatter.api.impl;

public class MessageSegments{
   	private String text;
   	private String type;

 	public String getText(){
		return this.text;
	}
	public void setText(String text){
		this.text = text;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
}
