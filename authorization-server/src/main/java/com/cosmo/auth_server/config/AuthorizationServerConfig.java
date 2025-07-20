package com.cosmo.auth_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.server.authorization.settings.AuthorizationServerSettings;

@Configuration
public class AuthorizationServerConfig {

    @Bean
    AuthorizationServerSettings authorizationServerSettings(@Value("${spring.security.oauth2.authorizationserver.issuer-uri}") String issuer) {
    return AuthorizationServerSettings.builder()
            .issuer(issuer)
            .build();
    }
}
