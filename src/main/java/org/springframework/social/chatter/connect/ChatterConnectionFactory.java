package org.springframework.social.chatter.connect;

import org.springframework.social.chatter.api.Chatter;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

public class ChatterConnectionFactory extends OAuth2ConnectionFactory<Chatter> {

	public ChatterConnectionFactory(String clientId, String clientSecret) {
		super("chatter", new ChatterServiceProvider(clientId, clientSecret), new ChatterAdapter());
	}
}
