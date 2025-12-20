package com.master.Springboot1;

import java.awt.Container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.Springboot1.services.Master;

@SpringBootApplication // -> @ComponentScan @EnableAutoConfiguration
public class Springboot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Springboot1Application.class, args);
	
		Master master = container.getBean(Master.class);
		master.disp();
		
		container.close();
	}

}
