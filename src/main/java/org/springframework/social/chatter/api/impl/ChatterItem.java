
package org.springframework.social.chatter.api.impl;

import java.util.List;

public class ChatterItem{
   	private Body body;
   	private String clientInfo;
   	private Comments comments;
   	private String createdDate;
   	private boolean event;
   	private String attachment;
   	private String id;
   	private Likes likes;
   	private boolean isLikedByCurrentUser;
   	private Like currentUserLike;
   	private String modifiedDate;
   	private String parentId;
   	private String parentName;
   	private String type;
   	private String url;
   	private String photoUrl;
   	private List<SupplementalProperty> supplementalProperties;
	private User parent;
	private User actor;

 	public Body getBody(){
		return this.body;
	}
	public void setBody(Body body){
		this.body = body;
	}
 	public String getClientInfo(){
		return this.clientInfo;
	}
	public void setClientInfo(String clientInfo){
		this.clientInfo = clientInfo;
	}
 	public Comments getComments(){
		return this.comments;
	}
	public void setComments(Comments comments){
		this.comments = comments;
	}
 	public String getCreatedDate(){
		return this.createdDate;
	}
	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}
 	public boolean getEvent(){
		return this.event;
	}
	public void setEvent(boolean event){
		this.event = event;
	}
 	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public Likes getLikes(){
		return this.likes;
	}
	public void setLikes(Likes likes){
		this.likes = likes;
	}
 	public boolean isLikedByCurrentUser() {
		return isLikedByCurrentUser;
	}
	public void setIsLikedByCurrentUser(boolean isLikedByCurrentUser) {
		this.isLikedByCurrentUser = isLikedByCurrentUser;
	}
	public Like getCurrentUserLike() {
		return currentUserLike;
	}
	public void setCurrentUserLike(Like currentUserLike) {
		this.currentUserLike = currentUserLike;
	}
	public String getModifiedDate(){
		return this.modifiedDate;
	}
	public void setModifiedDate(String modifiedDate){
		this.modifiedDate = modifiedDate;
	}
 	public String getParentId(){
		return this.parentId;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}
 	public String getParentName(){
		return this.parentName;
	}
	public void setParentName(String parentName){
		this.parentName = parentName;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
   	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public List<SupplementalProperty> getSupplementalProperties() {
		return supplementalProperties;
	}
	public void setSupplementalProperties(
			List<SupplementalProperty> supplementalProperties) {
		this.supplementalProperties = supplementalProperties;
	}
 	public User getParent(){
		return this.parent;
	}
	public void setParent(User parent){
		this.parent = parent;
	}
	public User getActor() {
		return actor;
	}
	public void setActor(User actor) {
		this.actor = actor;
	}
}
