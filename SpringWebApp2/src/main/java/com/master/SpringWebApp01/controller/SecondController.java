package com.master.SpringWebApp01.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/master2")
public class SecondController {
	@GetMapping("/welcome")
	public String displayResponse(Model model) {
		System.out.println("Impl Class Name : "+model.getClass().getName());
		model.addAttribute("info", "My Name is Mahendra!");
		return "home";
	}
	
	@GetMapping("/info")
	public String displayResponse1(Map<String, Object> map) { 
		map.put("info", "My Name is Master!");
		return "master";
	}
	

}
