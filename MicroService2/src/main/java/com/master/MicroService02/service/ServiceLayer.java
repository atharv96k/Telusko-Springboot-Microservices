package com.master.MicroService02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {

	@Autowired
	private FeignClientService feignClientService;
	
	public String getCourseInfo() {
//		RestTemplate restTemplate = new RestTemplate();
//		  ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/msg-m1", String.class);
//		  return response.getBody() + " comming from Microservice 1";
		
		ResponseEntity<String> response = feignClientService.getinfo();
		  return response.getBody() + " comming from Microservice 1 using Feign Client";
	}
}
