package com.master.RestApiApp1.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.master.RestApiApp1.model.Student;

@Service
public class Greetings implements IGreetings {

	@Override
	public String generateWish(String name) {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		if (hour<12) {
			return "Good Morning " + name+"!";
		}
		return "Good Night " + name+"!";
	}

	@Override
	public Boolean addStudent(Student student) {
		System.out.println(student);
		return true;
	}

}
