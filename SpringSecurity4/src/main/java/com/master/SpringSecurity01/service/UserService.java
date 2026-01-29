package com.master.SpringSecurity01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.SpringSecurity01.enity.User;
import com.master.SpringSecurity01.repo.IUserRepo;
@Service
public class UserService {
	
	@Autowired
	private IUserRepo repo;
	
	public User register(User user) {
		 return repo.save(user);
	}
}
