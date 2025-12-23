package com.master.SpringWebApp01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; 

@Controller
public class FirstController {  
	@GetMapping("/welcome")
	public String displayResponse(Model model) {
		System.out.println("Impl Class Name : "+model.getClass().getName());
		model.addAttribute("info", "My Name is Atharv!");
		return "home";
	}
	@GetMapping("/dekstop")
	public void displayResponse1(Model model) {
		System.out.println("Impl Class Name : "+model.getClass().getName());
		model.addAttribute("info", "My Name is Desktop!");
		return;
	}
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		model.addAttribute("user", "User registered by name Atharv.");
		return "register";
	}
}
	