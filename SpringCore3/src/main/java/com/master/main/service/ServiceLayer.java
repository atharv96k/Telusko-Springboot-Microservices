package com.master.main.service;

import org.springframework.stereotype.Service;

@Service("service")  //bean-id(by default) = serviceLayer 
public class ServiceLayer {

	public ServiceLayer() {
		System.out.println("Service bean created");
	}

}
