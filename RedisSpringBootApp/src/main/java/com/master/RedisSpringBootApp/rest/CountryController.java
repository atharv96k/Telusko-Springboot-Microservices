package com.master.RedisSpringBootApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.RedisSpringBootApp.model.Country;
import com.master.RedisSpringBootApp.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService service;
	
	@PostMapping("/add-country")
	public String addCountry(@RequestBody Country country) {
		return service.addCountry(country);
	}
}
