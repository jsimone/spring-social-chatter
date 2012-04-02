/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.chatter.connect;

import org.springframework.social.ApiException;
import org.springframework.social.chatter.api.Chatter;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;

/**
 * Facebook ApiAdapter implementation.
 * @author Keith Donald
 */
public class ChatterAdapter implements ApiAdapter<Chatter> {

	public boolean test(Chatter chatter) {
		try {
			chatter.getPosts();
			return true;
		} catch (ApiException e) {
			return false;
		}
	}

	public void setConnectionValues(Chatter chatter, ConnectionValues values) {
		//TODO: implement after user profile api is set up
//		FacebookProfile profile = facebook.userOperations().getUserProfile();
//		values.setProviderUserId(profile.getId());
//		values.setDisplayName(profile.getUsername());
//		values.setProfileUrl("http://facebook.com/profile.php?id=" + profile.getId());
//		values.setImageUrl("http://graph.facebook.com/" + profile.getId() + "/picture");
	}

	public UserProfile fetchUserProfile(Chatter chatter) {
		return new UserProfileBuilder().build();
	}
	
	public void updateStatus(Chatter chatter, String message) {
		//TODO: Method has no effect
	}

}
