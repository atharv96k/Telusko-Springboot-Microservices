package com.master.Springboot1.services;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class Master {
	static 
	{
		System.out.println("Static block of Master Bean");
	}
	
	{
		System.out.println("Java Instance block of Master Bean");
	}
	
	public Master() 
	{
		System.out.println("Master bean is created");
	}
	
	@PostConstruct
	public void init() 
	{
		System.out.println("Init Method of Master");
	}
	
	public void disp() 
	{
		System.out.println("Businss logic of Master Class");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy Method of Master Class");
	}
}
