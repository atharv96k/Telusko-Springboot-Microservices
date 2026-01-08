package com.master.RestApiApp1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.master.RestApiApp1.model.Student;

@Controller
@RequestMapping("restapi2")
public class GreetingsController2 {

	@GetMapping("/getJson")
	public ResponseEntity<Student> getStudent(){
		Student student = new Student(23, "Atharv", "Tasgaon");
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	
	@PostMapping("/sendJson")
	public ResponseEntity<String> getStudent(@RequestBody Student student){
		System.out.println(student);
		String res= "Information Successfully Saved!";
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
}
