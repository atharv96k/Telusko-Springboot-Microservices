package com.master.SpringBatchProcessing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Customer {
	
	@Id
	private Integer customerId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phoneNum;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
	private String country;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Customer(Integer customerId, String firstName, String lastName, String email, String phoneNum,
			String address, String city, String state, String zipCode, String country) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", LastName=" + lastName + ", email="
				+ email + ", phoneNum=" + phoneNum + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", country=" + country + "]";
	}
}
