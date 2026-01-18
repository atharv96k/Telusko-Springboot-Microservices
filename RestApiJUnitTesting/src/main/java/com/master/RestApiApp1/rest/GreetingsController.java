package com.master.RestApiApp1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.RestApiApp1.model.Student;
import com.master.RestApiApp1.service.IGreetings;

@RestController
@RequestMapping("/restapi")
public class GreetingsController {

	@Autowired
	private IGreetings service;
	
	@GetMapping("/greet")
	public ResponseEntity<String> getWishes(){
		String res = service.generateWish("Rest Atharv");
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody Student data){ 
		Boolean status = service.addStudent(data);
		if (status) {
			String res= "Information Successfully Saved!";
			return new ResponseEntity<String>(res,HttpStatus.OK);
		}else {
			String res= "Information Couldn't be Saved!";
			return new ResponseEntity<String>(res,HttpStatus.OK);
		}

	}
}
