package org.springframework.social.chatter.api.impl;

import java.util.List;

public class ChatterFeed {

	private List<ChatterItem> items;
	private String currentPageUrl;
	private String nextPageUrl;
	private String isModifiedUrl;

	public List<ChatterItem> getItems() {
		return items;
	}
	public void setItems(List<ChatterItem> items) {
		this.items = items;
	}
	public String getCurrentPageUrl() {
		return currentPageUrl;
	}
	public void setCurrentPageUrl(String currentPageUrl) {
		this.currentPageUrl = currentPageUrl;
	}
	public String getNextPageUrl() {
		return nextPageUrl;
	}
	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}
	public String getIsModifiedUrl() {
		return isModifiedUrl;
	}
	public void setIsModifiedUrl(String isModifiedUrl) {
		this.isModifiedUrl = isModifiedUrl;
	}
	
}
