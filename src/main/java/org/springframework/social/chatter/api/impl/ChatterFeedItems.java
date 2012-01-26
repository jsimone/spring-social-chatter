package org.springframework.social.chatter.api.impl;

import java.util.List;

public class ChatterFeedItems {

	private List<ChatterItem> items;
	private String nextPageUrl;

	public List<ChatterItem> getItems() {
		return items;
	}
	public void setItems(List<ChatterItem> items) {
		this.items = items;
	}
	public String getNextPageUrl() {
		return nextPageUrl;
	}

	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}
}
