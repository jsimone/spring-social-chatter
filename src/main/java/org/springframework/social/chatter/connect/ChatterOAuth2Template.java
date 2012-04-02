package org.springframework.social.chatter.connect;

import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class ChatterOAuth2Template extends OAuth2Template {

	public static final String CHATTER_AUTH_URL = "http://login.salesforce.com";
	public static final String CHATTER_ACCESS_TOKEN_URL = "http://login.salesforce.com/services/oauth2/token";
	
	public ChatterOAuth2Template(String clientId, String clientSecret) {
		super(clientId, clientSecret, CHATTER_AUTH_URL, CHATTER_ACCESS_TOKEN_URL);
	}
	
//	@Override
//	@SuppressWarnings("unchecked")	
//	protected AccessGrant postForAccessGrant(String accessTokenUrl, MultiValueMap<String, String> parameters) {
//		MultiValueMap<String, String> response = getRestTemplate().postForObject(accessTokenUrl, parameters, MultiValueMap.class);
//		//String expires = response.getFirst("expires");
//		//return new AccessGrant(response.getFirst("access_token"), null, null, expires != null ? Integer.valueOf(expires) : null);
//	}

}
