package com.master.SpringSecurity01.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.master.SpringSecurity01.enity.User;

public class UserPrinciple implements UserDetails {
	@Autowired
	private User user;
	
	public UserPrinciple(User name) {
		this.user = name;
	}
 
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() { 
		return user.getPassword();
	}

	@Override
	public String getUsername() { 
		return user.getUsername();
	} 
}
