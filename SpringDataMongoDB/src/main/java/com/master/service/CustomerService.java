package com.master.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.dto.CustomerDTO;
import com.master.model.Customer;
import com.master.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	public ICustomerRepo repo;

	@Override
	public String registerCutomer(CustomerDTO dto) {
		Customer ctx = new Customer();
		BeanUtils.copyProperties(dto, ctx);
		Customer custDoc = repo.save(ctx);
		return "Customer Information Saved! with MongoID: "+custDoc.getId();
	}

	@Override
	public List<Customer> findAllCustomer() {
		return repo.findAll();
	}

	@Override
	public String deleteDocument(String id) {
		
		Optional<Customer> ids = repo.findById(id);
		if (ids.isPresent()) {
			repo.deleteById(id);
			return "Deletion Successful!";
		}
		return "Deletion Failed";
	}

}
