
package org.springframework.social.chatter.api.impl;


public class User{
   	private String firstName;
   	private String id;
   	private String lastName;
   	private String companyName;
   	private String mySubscription;
   	private String name;
   	private Photo photo;
   	private boolean isChatterGuest;
   	private String title;
   	private String url;
   	private String type;

 	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
 	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMySubscription() {
		return mySubscription;
	}
	public void setMySubscription(String mySubscription) {
		this.mySubscription = mySubscription;
	}
	public boolean isChatterGuest() {
		return isChatterGuest;
	}
	public void setIsChatterGuest(boolean isChatterGuest) {
		this.isChatterGuest = isChatterGuest;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public Photo getPhoto(){
		return this.photo;
	}
	public void setPhoto(Photo photo){
		this.photo = photo;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
