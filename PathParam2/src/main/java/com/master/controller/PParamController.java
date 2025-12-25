package com.master.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;
 

@Controller
public class PParamController {

	@GetMapping("/getinfo/{name}/{course}")
	public String getSomeInfo(@PathVariable("name")String n,@PathVariable("course")String c, Map<String, Object> map) {
		String infoString = "Hello " + n + " you have been hacked!, and Your course is " + c;
		map.put("msg", infoString);
		return "queryParam";
	}
	
}

