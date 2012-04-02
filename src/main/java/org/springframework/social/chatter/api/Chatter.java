package org.springframework.social.chatter.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.chatter.api.impl.ChatterFeed;

public interface Chatter extends ApiBinding{
	
	ChatterFeed getPosts();

}
