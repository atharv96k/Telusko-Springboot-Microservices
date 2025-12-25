package com.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.master.model.Course;

@Controller
public class BooksController {

	@GetMapping("/courseinfo")
	public String getCourseInfo(Model model) {
		model.addAttribute("cid","T1");
		model.addAttribute("cname","Spring Web MVC");
		model.addAttribute("cprice","5999 INR");
		return "cinfo";
	}

	@GetMapping("/coursedetails")
	public String getCoursedetails(Model model) {
		Course course = new Course();
		course.setCid(01);
		course.setCname("Microservices");
		course.setCprice(7999.0);
		model.addAttribute("course", course); 
		return "cdetails";
	}
}

