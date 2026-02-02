package com.master.MicroService01.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController { 
	
	@GetMapping("/msg-m1")
	public ResponseEntity<String> getinfo(){
		String msgString ="Hello Dear Atharv";
		return new ResponseEntity<String>(msgString, HttpStatus.OK);
	}
}
