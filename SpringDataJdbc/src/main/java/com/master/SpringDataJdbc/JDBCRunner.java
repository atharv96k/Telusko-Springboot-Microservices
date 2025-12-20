package com.master.SpringDataJdbc;

import org.springframework.boot.CommandLineRunner;


import com.master.SpringDataJdbc.dao.EmployeeDao;
import com.master.SpringDataJdbc.model.Employee;

public class JDBCRunner implements CommandLineRunner {

	private EmployeeDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.input(new Employee(2,"Nikhil","Tasgaon"));
	}

}
