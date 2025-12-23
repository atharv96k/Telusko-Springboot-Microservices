package com.master.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
 

@Controller
public class QParam {

	@GetMapping("/queryparam")
	public String getSomeInfo(String name,@RequestParam("course") String cname, Map<String, Object> map) {
		String infoString = "Hello " + name + " you have been hacked!, and Your course is " + cname;
		map.put("msg", infoString);
		return "queryParam";
	}
	
}

