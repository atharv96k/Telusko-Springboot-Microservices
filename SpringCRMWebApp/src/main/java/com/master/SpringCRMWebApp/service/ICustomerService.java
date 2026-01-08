package com.master.SpringCRMWebApp.service;

import java.util.List;

import com.master.SpringCRMWebApp.model.Customer;

public interface ICustomerService {
	public List<Customer> getCustomerInfo();
	public void registerCustomer(Customer customer);
	public Customer fetchCustomerbyID(Integer id);
	public void deleteByID(Integer id);
	
}
