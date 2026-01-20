package com.master.SpringSecurity01.rest;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.SpringSecurity01.model.Alien;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AlienController {

	 List<Alien> list = new ArrayList<>(List.of(
			 new Alien(1,"Atharv","Sangali"),
			 new Alien(2,"Mohit","Mumbai"),
			 new Alien(3,"Raj","Tasgaon"),
			 new Alien(4,"Veer","Miraj")));
	 
	 @GetMapping("/get-aliens")
	 public List<Alien> getAliens(){
		 return list;
	 }
	 
	 @PostMapping("/add-alien")
	 public String addAlien(Alien alien) {
		 list.add(alien);
		 System.out.println(alien);
		 return "Added Successfully!";
	 }
	 
	 @GetMapping("/get-info")
	 public String getInfo(HttpServletRequest request) {
		 return "The Session id is : "+request.getSession().getId();
	 }
 }
