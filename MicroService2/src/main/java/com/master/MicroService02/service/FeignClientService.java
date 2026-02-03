package com.master.MicroService02.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MICROSERVICE-1")
public interface FeignClientService {
	
	@GetMapping("/msg-m1")
	public ResponseEntity<String> getinfo();
}
