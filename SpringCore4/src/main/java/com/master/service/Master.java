package com.master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Master {
	
//	@Autowired
//	@Qualifier("springBoot")
	private ICourse course;
	
	//Constructor Injection
	@Autowired
	public Master(@Qualifier("springBoot") ICourse course) {
		super();
		System.out.println("Constructor Injection");
		this.course = course;
	}


	public Master() {
		super();
		System.out.println("Master Bean Created");
	}

	//Setter Injection
//	@Autowired
//	@Qualifier("springBoot")
	public void setCourse(ICourse course) {
		System.out.println("Setter Injection");
		this.course = course;
	}

	public boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
}
