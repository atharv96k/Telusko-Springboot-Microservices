package com.master.service;

import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements ICourse {

	public SpringBoot()
	{
		System.out.println("Springboot Bean Created");
	}
	
	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Springboot course is purchased and Amount is paid "+amount);
		return true;
	}

}
