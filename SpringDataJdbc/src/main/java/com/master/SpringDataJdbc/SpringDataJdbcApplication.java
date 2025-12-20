package com.master.SpringDataJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.SpringDataJdbc.dao.EmployeeDao;
@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcApplication.class, args);
//		EmployeeDao dao = container.getBean(EmployeeDao.class);
//		
//		dao.input();
	}

}
