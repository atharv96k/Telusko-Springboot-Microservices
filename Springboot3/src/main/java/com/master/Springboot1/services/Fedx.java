package com.master.Springboot1.services;

import org.springframework.stereotype.Service;

@Service
public class Fedx implements IDelivery {

	
	public Fedx() {
		System.out.println("Fedx bean is created!");
	}

	@Override
	public boolean deliverTheProduct(Double Amount) {
		System.out.println("Product Delivered with Fedx and AMOUNT IS PAID IS "+Amount);
		return true;
	}

}
