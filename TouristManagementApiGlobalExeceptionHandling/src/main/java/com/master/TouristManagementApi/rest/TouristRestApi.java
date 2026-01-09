
package com.master.TouristManagementApi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class TouristRestApi {

	@Autowired
	private ITouristService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
		String response  = service.registerTourist(tourist);
		return new ResponseEntity<String>(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/getTourist/{id}")
	public ResponseEntity<?> getTourist(@PathVariable Integer id){
			Tourist response=service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(response,HttpStatus.OK);
	}
	
	@GetMapping("/getAllTourist")
	public ResponseEntity<?> getAllTourist(){
			List<Tourist> tourists=service.fetchAllTouristInfo();
			return new ResponseEntity<List>(tourists,HttpStatus.OK);
	}
	
	
	//To Update Max Amount of Data Use PutMapping
	@PutMapping("/updateTourist")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
			String status=service.updateTourist(tourist);
			return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
	//To update minimal amount of Data use PatchMapping
	@PatchMapping("/updateBudget/{id}/{budget}")
	public ResponseEntity<String> updateTouristBudget(@PathVariable Integer id,@PathVariable Double budget){
			String status=service.updateTouristBudget(id,budget);
			return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTourist/{id}")
	public ResponseEntity<String> deleteTouristByID(@PathVariable Integer id){
			String status=service.deleteTouristInfoByID(id);
			return new ResponseEntity<String>(status,HttpStatus.OK);
	}
}
