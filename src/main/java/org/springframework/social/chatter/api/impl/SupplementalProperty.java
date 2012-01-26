package org.springframework.social.chatter.api.impl;

public class SupplementalProperty {

	public String type;
	public Data data;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
}
