package com.master.MasterCCSTest.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${msg}")
	private String msg;
	
	@GetMapping("/msg")
	public String getMsg() {
		return msg;
	}
}
