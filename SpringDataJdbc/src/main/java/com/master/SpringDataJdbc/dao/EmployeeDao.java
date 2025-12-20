package com.master.SpringDataJdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.master.SpringDataJdbc.model.Employee;

@Repository("dao")
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
//	private String sql = "INSERT INTO EMPLOYEE(id, name, city)VALUEs(1,'Atharv','Tasgaon')";
	private String sql = "INSERT INTO EMPLOYEE(id,name,city) VALUE(?, ?, ?)";

//		public void input() {
//			jdbcTemplate.update(sql);
//			System.out.println("Data Inserted");
//		}
	
	public void input(Employee emp) {
		jdbcTemplate.update(sql, emp.getId(),emp.getName(),emp.getCity());
			System.out.println("Data Inserted");
	}

}
