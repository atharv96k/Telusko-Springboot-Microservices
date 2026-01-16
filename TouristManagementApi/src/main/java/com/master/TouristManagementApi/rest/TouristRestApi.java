
package com.master.TouristManagementApi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.TouristManagementApi.exception.TouristNotFoundException;
import com.master.TouristManagementApi.model.Tourist;
import com.master.TouristManagementApi.service.ITouristService;

@RestController 
@Scope("session")
public class TouristRestApi {

	@Autowired
	private ITouristService service;
	
	public TouristRestApi() { 
		System.out.println("TouristRestAPI bean is Created");
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
		String response  = service.registerTourist(tourist);
		return new ResponseEntity<String>(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/getTourist/{id}")	
	public ResponseEntity<?> getTourist(@PathVariable Integer id){
		try {
			Tourist response=service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(response,HttpStatus.OK);
		} catch (TouristNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAllTourist")
	public ResponseEntity<?> getAllTourist(){
		try {
			List<Tourist> tourists=service.fetchAllTouristInfo();
			return new ResponseEntity<List>(tourists,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Users Not Found!",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//To Update Max Amount of Data Use PutMapping
	@PutMapping("/updateTourist")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
		try {
			String status=service.updateTourist(tourist);
			return new ResponseEntity<String>(status,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	//To update minimal amount of Data use PatchMapping
	@PatchMapping("/updateBudget/{id}/{budget}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable Integer id,@PathVariable Double budget){
		try {
			String status=service.updateTouristBudget(id,budget);
			return new ResponseEntity<String>(status,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/deleteTourist/{id}")
	public ResponseEntity<String> deleteTouristByID(@PathVariable Integer id){
		try {
			String status=service.deleteTouristInfoByID(id);
			return new ResponseEntity<String>(status,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
