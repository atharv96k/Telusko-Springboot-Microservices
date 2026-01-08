package com.master.RestApiApp1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.RestApiApp1.service.IGreetings;

@RestController
@RequestMapping("restapi")
public class GreetingsController {

	@Autowired
	private IGreetings greetings;
	
	@GetMapping("/greet")
	public ResponseEntity<String> getWishes(){
		String res = greetings.generateWish("Rest Atharv");
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@GetMapping("/greet2")
	public String  getWishes2(){
		String res = greetings.generateWish("Rest Raghav");
		return res;
	}
}
