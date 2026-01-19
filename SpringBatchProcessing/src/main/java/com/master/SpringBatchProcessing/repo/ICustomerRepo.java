package com.master.SpringBatchProcessing.repo;

import java.beans.Customizer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.SpringBatchProcessing.model.Customer;


@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
