package com.master.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.master.main.dao.Password;

public class LaunchApplication {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Password b = container.getBean(Password.class);
		b.getPassAlgo();
	}
}
