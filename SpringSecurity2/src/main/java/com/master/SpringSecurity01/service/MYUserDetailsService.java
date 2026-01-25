package com.master.SpringSecurity01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.master.SpringSecurity01.enity.User;
import com.master.SpringSecurity01.repo.IUserRepo;

@Service
public class MYUserDetailsService implements UserDetailsService{

	@Autowired
	private IUserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = repo.findByName(userName);
		if (user == null) {
			throw new UsernameNotFoundException("User Not Found!");
		}
		return new UserPrinciple(user);
	}

}
