package com.master.SpringSecurity3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
@EnableWebSecurity
public class SecurityConfig {

	/**
	 * @return
	 * @throws Exception 
	 */
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception 
	{
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
		.oauth2Login(Customizer.withDefaults());
		return http.build();
		
	}
}
