package com.master.Springboot1;

import java.awt.Container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.Springboot1.services.Amazon;
 

@SpringBootApplication // -> @ComponentScan @EnableAutoConfiguration
public class Springboot1Application 
{ 
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(Springboot1Application.class, args);
	 
		Amazon amzn = container.getBean(Amazon.class);
		Boolean status = amzn.deliverTheProduct(5999.99);
		if (status) 
		{
			System.out.println("Hola, Delivery Successful!");
		}
		else 
		{
			System.out.println("Delivery Failure..	");
		}
		container.close();
	}

}
