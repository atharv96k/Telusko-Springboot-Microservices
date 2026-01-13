package com.master.RestApiApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.RestApiApp1.service.ICourse;

@SpringBootApplication
public class RestApiApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(RestApiApp1Application.class, args);
		ICourse course = container.getBean(ICourse.class);
		course.getCourse(4545.78);
	}

}
