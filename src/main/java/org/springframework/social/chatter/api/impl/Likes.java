
package org.springframework.social.chatter.api.impl;

import java.util.List;

public class Likes{
   	private String currentPageUrl;
   	private List<Like> likes;
   	private String nextPageUrl;
   	private String previousPageUrl;
   	private Number total;

 	public String getCurrentPageUrl(){
		return this.currentPageUrl;
	}
	public void setCurrentPageUrl(String currentPageUrl){
		this.currentPageUrl = currentPageUrl;
	}
 	public List<Like> getLikes(){
		return this.likes;
	}
	public void setLikes(List<Like> likes){
		this.likes = likes;
	}
 	public String getNextPageUrl() {
		return nextPageUrl;
	}
	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}
	public String getPreviousPageUrl() {
		return previousPageUrl;
	}
	public void setPreviousPageUrl(String previousPageUrl) {
		this.previousPageUrl = previousPageUrl;
	}
	public Number getTotal(){
		return this.total;
	}
	public void setTotal(Number total){
		this.total = total;
	}
}
