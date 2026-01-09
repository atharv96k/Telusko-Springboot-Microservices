package com.master.TouristManagementApi.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.master.TouristManagementApi.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristException(TouristNotFoundException tnf){
		ErrorDetails error = new ErrorDetails("404 Not Found", tnf.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> exception(ExceptionInInitializerError e){
		ErrorDetails error = new ErrorDetails("Internal Server Error", e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
}
