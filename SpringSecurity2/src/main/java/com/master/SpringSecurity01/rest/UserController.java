package com.master.SpringSecurity01.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.SpringSecurity01.enity.User;
import com.master.SpringSecurity01.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(12);
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		String encoded = bcrypt.encode(user.getPassword());
		user.setPassword(encoded);
		return service.register(user);
	}
	
	@GetMapping("/getCInfo")
	public String getCInfo(HttpServletRequest request) {
		return "The Course of Spring Security is Starting From Next Week!";
	}
}
