package com.master.TouristManagementApi.service;

import java.util.List;

import com.master.TouristManagementApi.exception.TouristNotFoundException;
import com.master.TouristManagementApi.model.Tourist;

public interface ITouristService {

	String registerTourist(Tourist tourist);
	
	Tourist fetchTouristById(Integer id) throws TouristNotFoundException;
	
	List<Tourist> fetchAllTouristInfo();
}
