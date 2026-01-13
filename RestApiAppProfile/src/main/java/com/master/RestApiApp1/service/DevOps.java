package com.master.RestApiApp1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("devops")
public class DevOps implements ICourse {
	public DevOps() {
		System.out.println("DevOps bean is created");
	}

	@Override
	public Boolean getCourse(Double amount) { 
		System.out.println("DevOps Course is purchased and the amount paid is "+ amount);
		return true;
	}

}
