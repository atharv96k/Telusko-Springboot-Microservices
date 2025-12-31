package com.master.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.master.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/home")
	public String getSomeInfo( ) {
		return "home";
	}

	@GetMapping("/register")
	public String areg() {
		return "register";
	}
	
	@PostMapping("/response")
	public String registerEmployee(Map<String, Object> map, Employee emp) {
		System.out.println(emp);
		map.put("emp", emp);
		return "response";
	}

}

