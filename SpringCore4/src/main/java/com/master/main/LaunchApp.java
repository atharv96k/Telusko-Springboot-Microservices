package com.master.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.master.service.Master;

public class LaunchApp 
{
	public static void main(String[] args) 
	{
//		First Approach(Eager Initialization)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Master m = context.getBean(Master.class);
		boolean status = m.buyTheCourse(2999.0);
		 
		if (status)
			System.out.println("Course enrolled successfully!");
		else
			System.out.println("Failed to enroll the course");
		
		}
	}

