package com.master.SpringSecurity3.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController {

	@GetMapping("/info")	
	public String welcome() {
		return "Welcome to Telusko Spring Security Application";
	}
}
