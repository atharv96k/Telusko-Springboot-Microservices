package com.master.TouristManagementApi.advice;

import java.time.LocalDateTime;

public class ErrorDetails {

	private String statusCode;
	
	private String message;
	
	private LocalDateTime dateTime;

	public ErrorDetails(String statusCode, String message, LocalDateTime dateTime) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.dateTime = dateTime;
	}

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "ErrorDetails [statusCode=" + statusCode + ", message=" + message + ", dateTime=" + dateTime + "]";
	}
	
}
