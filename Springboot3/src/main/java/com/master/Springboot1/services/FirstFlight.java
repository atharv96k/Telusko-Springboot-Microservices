package com.master.Springboot1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstFlight implements IDelivery {

	 public FirstFlight()  {
		System.out.println("FirstFlight bean is created!");
	}

	@Override
	public boolean deliverTheProduct(Double Amount) {
		System.out.println("Product Delivered with FirstFlight and AMOUNT IS PAID IS "+Amount);
		return true;
	}

}
