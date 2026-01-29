package com.master.SpringSecurity01.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import com.master.SpringSecurity01.enity.User;
import com.master.SpringSecurity01.service.JWTTokenService;
import com.master.SpringSecurity01.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController 
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private JWTTokenService jwtservice;
	
	@Autowired
	private AuthenticationManager authManager;
	
	BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(12);
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		String encoded = bcrypt.encode(user.getPassword());
		user.setPassword(encoded);
		return service.register(user);
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestBody User user) {
		Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if (authentication.isAuthenticated()) {
			String jwt = jwtservice.generateToken(user.getUsername());
			System.out.println(jwt);
			return jwt;
		}
		else {
			return "Failure!";
		}
	}
	
	
	@GetMapping("/getCInfo")
	public String getCInfo(HttpServletRequest request) {
		return "The Course of Spring Security is Starting From Next Week!";
	}
}
