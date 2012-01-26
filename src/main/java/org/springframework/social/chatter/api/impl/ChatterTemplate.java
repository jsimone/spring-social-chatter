package org.springframework.social.chatter.api.impl;

import java.net.URI;

import org.springframework.social.chatter.api.Chatter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.URIBuilder;

public class ChatterTemplate extends AbstractOAuth2ApiBinding implements Chatter {

	public static final String API_VERSION = "v22.0";
	
	public ChatterTemplate(String accessToken) {
		super(accessToken);
	}
	
	private URI buildUri(String path) {
		return URIBuilder.fromUri(getEndpoint() + path).build();
	}
	
	private String getEndpoint() {
		//TODO: get correct endpoint
		return "https://na1.salesforce.com";
	}
	
	public ChatterFeed getPosts() {
	    return getRestTemplate().getForObject(buildUri("/services/data/" + API_VERSION + "/chatter/feeds/news/me"),
	    		ChatterFeed.class);
	}

}
