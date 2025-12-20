package com.master.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.master.main.dao.Password;

@Configuration
public class Config {
	public Config() {
		System.out.println("Config bean created");
	}
	
	@Bean
	public Password createPasswordBean() {
		Password password = new Password("SHA");
		return password;
	}
}
