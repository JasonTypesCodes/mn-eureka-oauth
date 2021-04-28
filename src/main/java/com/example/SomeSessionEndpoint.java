package com.example;

import java.util.Map;

import javax.inject.Named;

import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.oauth2.client.OpenIdProviderMetadata;
import io.micronaut.security.oauth2.configuration.OauthClientConfiguration;
import io.micronaut.security.oauth2.endpoint.endsession.request.AbstractEndSessionRequest;
import io.micronaut.security.oauth2.endpoint.endsession.response.EndSessionCallbackUrlBuilder;

@Named("something")
public class SomeSessionEndpoint extends AbstractEndSessionRequest {

	public SomeSessionEndpoint(
		EndSessionCallbackUrlBuilder endSessionCallbackUrlBuilder,
		OauthClientConfiguration clientConfiguration,
		@Named("something") OpenIdProviderMetadata providerMetadata
	) {
		super(endSessionCallbackUrlBuilder, clientConfiguration, () -> providerMetadata);
	}

	@Override
	protected String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Map<String, Object> getArguments(HttpRequest<?> originating, Authentication authentication) {
		// TODO Auto-generated method stub
		return null;
	}

}
