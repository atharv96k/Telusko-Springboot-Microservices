
package com.master.TouristManagementApi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
}
