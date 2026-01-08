package com.master.SpringCRMWebApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.SpringCRMWebApp.model.Customer;
import com.master.SpringCRMWebApp.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public List<Customer> getCustomerInfo() {
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
		repo.save(customer);
	}

	@Override
	public Customer fetchCustomerbyID(Integer id) {
		Optional<Customer> optional = repo.findById(id);
		return optional.get();
	}

	@Override
	public void deleteByID(Integer id) {
		repo.deleteById(id);
	}

}
