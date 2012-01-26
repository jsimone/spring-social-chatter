
package org.springframework.social.chatter.api.impl;

import java.util.List;

public class Comments{
   	private List<Comments> comments;
   	private String currentPageUrl;
   	private String nextPageUrl;
   	private Number total;

 	public List<Comments> getComments(){
		return this.comments;
	}
	public void setComments(List<Comments> comments){
		this.comments = comments;
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
	public Number getTotal(){
		return this.total;
	}
	public void setTotal(Number total){
		this.total = total;
	}
}
