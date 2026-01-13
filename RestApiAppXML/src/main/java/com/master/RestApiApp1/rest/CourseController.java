package com.master.RestApiApp1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.RestApiApp1.model.Course;

@RestController
public class CourseController {

	@PostMapping(value = "/add-course", consumes = {"application/xml" })
	public ResponseEntity<String> addCourse(@RequestBody Course course){
		System.out.println(course);
		String msgString = "Course Information Added";
		return new ResponseEntity<>(msgString,HttpStatus.CREATED);
	}

	@GetMapping(value="/get-course", produces = {"application/xml"})
	@ResponseBody
	public ResponseEntity<Course> getCourse(){
		Course course = new Course(12,"Maths","6 Months",7889.9);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
}
