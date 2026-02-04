package com.master.MicroService01.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController { 
	
	@Autowired
	private Environment env;	
	
	@GetMapping("/msg-m1")
	public ResponseEntity<String> getinfo(){
		String portNo = env.getProperty("server.port");
		String msgString ="Hello Dear Atharv : " + portNo + " comming from another rest api";
		return new ResponseEntity<String>(msgString, HttpStatus.OK);
	}
}
