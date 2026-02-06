package com.master.RestApiApp1.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.ResponseBody;

import com.master.RestApiApp1.service.IGreetings;

@Controller 
public class GreetingsController {

//	private static final Logger LOGGER = LogManager.getLogger(GreetingsController.class);
	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingsController.class);
	@Autowired
	private IGreetings greetings;
	
	@GetMapping("/greet")
	@ResponseBody
	public ResponseEntity<String> getWishes(){
		LOGGER.info("Control is Heeree in info");
		String res = greetings.generateWish("Atharv");
		LOGGER.debug("Control is Heeree in Debug");
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@GetMapping("/greet2")
	@ResponseBody
	public String  getWishes2(){
		String res = greetings.generateWish("Raghav");
		return res;
	}
}
