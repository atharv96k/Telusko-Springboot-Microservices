package com.master.RestApiApp1.service;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
 

@Service
public class Greetings implements IGreetings {
	private static final Logger LOGGER = LoggerFactory.getLogger(IGreetings.class);

 	@Override
	public String generateWish(String name) {
		LOGGER.trace("Control is Heeree in trace");
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		if (hour<12) {
			return "Good Morning " + name+"!";
		}
		return "Good Night " + name+"!";
	}

}
