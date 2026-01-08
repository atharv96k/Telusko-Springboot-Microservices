package com.master.RestApiApp1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.master.RestApiApp1.service.IGreetings;

@Controller
@RequestMapping("api")
public class GreetingsController {

	@Autowired
	private IGreetings greetings;
	
	@GetMapping("/greet")
	@ResponseBody
	public ResponseEntity<String> getWishes(){
		String res = greetings.generateWish("Atharv");
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@GetMapping("/greet2")
	@ResponseBody
	public String  getWishes2(){
		String res = greetings.generateWish("Raghav");
		return res;
	}
}
