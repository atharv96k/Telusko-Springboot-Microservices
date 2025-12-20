package com.master.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.master.dto.CustomerDTO;
import com.master.model.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {
	

}
