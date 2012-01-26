
package org.springframework.social.chatter.api.impl;

import java.net.URL;

public class Photo{
   	private URL largePhotoUrl;
   	private URL smallPhotoUrl;
   	
	public URL getLargePhotoUrl() {
		return largePhotoUrl;
	}
	public void setLargePhotoUrl(URL largePhotoUrl) {
		this.largePhotoUrl = largePhotoUrl;
	}
	public URL getSmallPhotoUrl() {
		return smallPhotoUrl;
	}
	public void setSmallPhotoUrl(URL smallPhotoUrl) {
		this.smallPhotoUrl = smallPhotoUrl;
	}


}
