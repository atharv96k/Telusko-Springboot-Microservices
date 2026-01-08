package com.master.SpringCRMWebApp.repo;

import org.springframework.data.repository.CrudRepository;

import com.master.SpringCRMWebApp.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
