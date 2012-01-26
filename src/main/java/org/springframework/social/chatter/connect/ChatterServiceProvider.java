package org.springframework.social.chatter.connect;

import org.springframework.social.chatter.api.Chatter;
import org.springframework.social.chatter.api.impl.ChatterTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public class ChatterServiceProvider extends AbstractOAuth2ServiceProvider<Chatter> {
	
	public ChatterServiceProvider(String clientId, String clientSecret) {
		super(new ChatterOAuth2Template(clientId, clientSecret));
	}

	//TODO: maybe add in endpoint url here and bake into api classes?
	public Chatter getApi(String accessToken) {
		return new ChatterTemplate(accessToken);
	}
}
