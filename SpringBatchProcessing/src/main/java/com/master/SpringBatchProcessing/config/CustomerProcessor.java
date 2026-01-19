package com.master.SpringBatchProcessing.config;

import org.springframework.batch.item.ItemProcessor;

import com.master.SpringBatchProcessing.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
