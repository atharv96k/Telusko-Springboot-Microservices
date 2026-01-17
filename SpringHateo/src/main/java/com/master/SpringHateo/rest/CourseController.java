package com.master.SpringHateo.rest;
 
import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.SpringHateo.model.Course; 

@RestController
public class CourseController {
	
	@GetMapping("/get-course")
	public ResponseEntity<Course> getCourse(){
		
		Course course = new Course(21,"SpringBoot",5999.0);
		Link link = WebMvcLinkBuilder
			.linkTo(WebMvcLinkBuilder
			.methodOn(CourseController.class)
			.getAllCourse())
			.withRel("Click to Get All Courses Information..");
		
		course.add(link);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
 	}
	@GetMapping("/getall-course")
	public ResponseEntity<List> getAllCourse(){
		Course course1 = new Course(21,"SpringBoot",5999.0);
		Course course2 = new Course(22,"Kafka",6999.0);
		Course course3 = new Course(23,"Redis",8999.0);
		
		List<Course> courses = Arrays.asList(course1,course2,course3);
		return new ResponseEntity<List>(courses,HttpStatus.OK);
 	}
}
