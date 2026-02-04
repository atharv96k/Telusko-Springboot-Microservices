package com.master.MicroService02.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.MicroService02.service.ServiceLayer;

@RestController
public class TeluskoController { 
	@Autowired
	private ServiceLayer service; 
	
	@GetMapping("/msg-m2")
	public ResponseEntity<String> getinfo(){
		String msgString = service.getCourseInfo();
		return new ResponseEntity<String>(msgString, HttpStatus.OK);
	}
}
