package com.master.RestApiApp1.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"sb","springBoot"})
public class SpringBoot implements ICourse {

	public SpringBoot() {
		System.out.println("Springboot bean is created");
	}
	
	@Override
	public Boolean getCourse(Double amount) {
		System.out.println("Springboot Course is purchased and the amount paid is "+ amount);
		return true;
	}

}
