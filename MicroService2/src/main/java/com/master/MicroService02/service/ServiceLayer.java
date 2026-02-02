package com.master.MicroService02.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {

	public String getCourseInfo() {
		RestTemplate restTemplate = new RestTemplate();
		  ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8481/msg-m1", String.class);
		  return response.getBody() + " comming from Microservice 1";
	}
}
