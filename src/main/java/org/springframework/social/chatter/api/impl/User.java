
package org.springframework.social.chatter.api.impl;


public class User{
   	private String firstName;
   	private String id;
   	private String lastName;
   	private String name;
   	private Photo photo;
   	private String title;
   	private String url;

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

}
