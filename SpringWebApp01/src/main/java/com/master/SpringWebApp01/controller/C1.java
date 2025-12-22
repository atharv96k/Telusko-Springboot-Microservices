package com.master.SpringWebApp01.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class C1 {

	@RequestMapping("/welcome")
	public ModelAndView displayResponse() {
		ModelAndView m1 = new ModelAndView();
		m1.addObject("message", "Hello Atharv!");
		m1.setViewName("status");
		return m1;
	}
}
