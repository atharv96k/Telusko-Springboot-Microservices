package com.master.RestApiApp1.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

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

}
