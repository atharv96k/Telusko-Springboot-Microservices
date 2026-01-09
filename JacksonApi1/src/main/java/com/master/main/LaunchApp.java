package com.master.main;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.master.model.Alien;

import tools.jackson.databind.ObjectMapper;

public class LaunchApp {

	public static void main(String[] args) {
		/*
		//For Object To JSON
		
		Alien alien1 = new Alien(11, "Pranav", "Bhilvdi");
		Alien alien2 = new Alien(15, "Atharv", "Tasgaon");
		Alien alien3 = new Alien(19, "Santosh", "Atpadi");		
		
		List aliens = Arrays.asList(alien1,alien2,alien3);
	
		ObjectMapper mapper = new ObjectMapper();
//		String json = mapper.writeValueAsString(alien1);
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(aliens);
		System.out.println(json);
		*/
		ObjectMapper mapper = new ObjectMapper();
		Alien alien=mapper.readValue(new File("json/JsonFile.json"), Alien.class);
		System.out.println(alien);
	}
	
}
