package com.master.TouristManagementApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterService {
	
	@Autowired
	public ITouristService service;

	public MasterService() { 
		System.out.println("MasterService bean is Created");
	}
	
	

}
