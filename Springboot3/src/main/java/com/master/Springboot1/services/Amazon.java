package com.master.Springboot1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Amazon {

	private IDelivery service;
	
	public Amazon(IDelivery service) {
		this.service = service;
		System.out.println("Amazon Bean is Created!");
	}
	
	@Autowired
//	@Qualifier("firstFlight")
	public void setService(IDelivery service) {
		this.service = service;
	}

	public Boolean deliverTheProduct(Double Amount) {
		return service.deliverTheProduct(Amount);
	}
	
}
