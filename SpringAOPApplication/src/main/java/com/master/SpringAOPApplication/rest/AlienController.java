package com.master.SpringAOPApplication.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import com.master.SpringAOPApplication.model.Alien;
import com.master.SpringAOPApplication.service.IAlienService;

@RestController
public class AlienController {

	@Autowired
	private IAlienService service;
	
	@PostMapping("/add-alien")
	public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien){
		Alien al = service.registerAlien(alien);
		System.out.println(alien);
		return new ResponseEntity<Alien>(al,HttpStatus.CREATED);
	}
	
	@GetMapping("/get-aliens")
	public ResponseEntity<List> getAllAlien(){
		List<Alien> alienList = service.getAllAliensInfo();
		return new ResponseEntity<List>(alienList,HttpStatus.OK);
	}
}
