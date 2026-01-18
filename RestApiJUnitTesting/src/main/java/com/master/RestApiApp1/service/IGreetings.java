package com.master.RestApiApp1.service;

import com.master.RestApiApp1.model.Student;

public interface IGreetings  {
	String generateWish(String name);
	Boolean addStudent(Student student);
}