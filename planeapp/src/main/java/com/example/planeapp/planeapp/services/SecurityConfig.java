package com.example.planeapp.planeapp.services;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class SecurityConfig  {
    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange()
                .pathMatchers("/aircraft/**").hasAuthority("SCOPE_closedid")
                .pathMatchers("/aircraftadmin/**").hasAuthority("SCOPE_openid")
                .and().oauth2ResourceServer().jwt();

        return http.build();
    }

}
