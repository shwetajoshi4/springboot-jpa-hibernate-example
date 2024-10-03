package com.in28m9ns.rest.webservices.restful_web_services;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@SuppressWarnings("removal")
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// 1. All requests should be authenticated
		http.authorizeHttpRequests( auth-> auth.anyRequest().authenticated());
		
		//2. if a request is not authenticated, show a popup to enter user name password
		http.httpBasic(withDefaults());
		
		//3.CSRF(Cross-site Request Forgery ) -> POST,PUT
		http.csrf().disable();
		
		return http.build();
	}

}
