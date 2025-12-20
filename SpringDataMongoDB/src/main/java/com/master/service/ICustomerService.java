package com.master.service;

import java.util.List;

import com.master.dto.CustomerDTO;
import com.master.model.Customer;

public interface ICustomerService {

	public String registerCutomer(CustomerDTO dto);
	
	public List<Customer> findAllCustomer();
	
	public String deleteDocument(String id);

	
}
