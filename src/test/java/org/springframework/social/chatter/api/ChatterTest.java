package org.springframework.social.chatter.api;

import static org.junit.Assert.*;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.social.test.client.RequestMatchers.method;
import static org.springframework.social.test.client.RequestMatchers.requestTo;
import static org.springframework.social.test.client.ResponseCreators.withResponse;

import java.util.List;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.chatter.api.impl.Body;
import org.springframework.social.chatter.api.impl.ChatterFeed;
import org.springframework.social.chatter.api.impl.ChatterFeedItems;
import org.springframework.social.chatter.api.impl.ChatterItem;
import org.springframework.social.chatter.api.impl.ChatterTemplate;
import org.springframework.social.chatter.api.impl.Photo;
import org.springframework.social.chatter.api.impl.User;
import org.springframework.social.test.client.MockRestServiceServer;

public class ChatterTest {
	
	private static final String FIRST_POST_ID = "0D5E0000005UXZBKA4";
	private static final String FIRST_POST_TYPE = "UserStatus";
	private static final String FIRST_POST_USER_NAME = "John Simone";
	private static final String FIRST_POST_USER_ID = "005E0000000YmyoIAC";
	private static final String FIRST_POST_USER_PHOTO_URL = "https://c.na9.content.force.com/profilephoto/729E0000000PbOo/T";
	private static final String FIRST_POST_BODY_TEXT = "another post";
	
	ChatterTemplate chatter = new ChatterTemplate("accessToken");
	MockRestServiceServer mockServer = MockRestServiceServer.createServer(chatter.getRestTemplate());
	
	@Test
	public void getFeed() {
	    HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.setContentType(MediaType.APPLICATION_JSON);
	    
	    mockServer.expect(requestTo("https://na1.salesforce.com/services/data/v22.0/chatter/feeds/news/me"))
	        .andExpect(method(GET))
	        .andRespond(withResponse(jsonResource("testdata/basic-response"), responseHeaders));

	    ChatterFeed feed = chatter.getPosts();
	    
	    assertNotNull(feed);
	    ChatterFeedItems feedItems = feed.getFeedItems();
	    List<ChatterItem> posts = feedItems.getItems();
	    assertEquals("number of feed items is incorrect", 6, posts.size());
	    
	    ChatterItem post = posts.get(0);
	    assertEquals("post id is incorrect", FIRST_POST_ID, post.getId());
	    assertEquals("post type is incorrect", FIRST_POST_TYPE, post.getType());
	    
	    User user = post.getUser();
	    assertEquals("user name is incorrect", FIRST_POST_USER_NAME, user.getName());
	    assertEquals("user id is incorrect", FIRST_POST_USER_ID, user.getId());
	    
	    Photo photo = user.getPhoto();
	    assertEquals("user phot url is incorrect", FIRST_POST_USER_PHOTO_URL, photo.getSmallPhotoUrl().toString());
	    
	    Body body = post.getBody();
	    assertEquals("body text is incorrect", FIRST_POST_BODY_TEXT, body.getText());
	    assertEquals("wrong number of message segments", 1, body.getMessageSegments().size());
	    
	}
	
	private Resource jsonResource(String filename) {
	    return new ClassPathResource(filename + ".json", getClass());
	}
}
