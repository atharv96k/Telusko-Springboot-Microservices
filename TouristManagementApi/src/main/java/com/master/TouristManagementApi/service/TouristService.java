package com.master.TouristManagementApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.TouristManagementApi.dao.ITouristRepo;
import com.master.TouristManagementApi.exception.TouristNotFoundException;
import com.master.TouristManagementApi.model.Tourist;


@Service
public class TouristService implements ITouristService {

	@Autowired
	private ITouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		Tourist tour=repo.save(tourist);
		return "Tourist Information Registered With ID " + tour.getId();
	}

	@Override
	public Tourist fetchTouristById(Integer id) throws TouristNotFoundException {
//		Optional<Tourist> optional = repo.findById(id);
//		if (optional.isPresent()) {
//			return optional.get();
//		}else {
//			throw new TouristNotFoundException("Tourist With Given Id Not Found!");
//		}
		
		return repo.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist With Given Id Not Found!"));
	}

	@Override
	public List<Tourist> fetchAllTouristInfo() {
		return repo.findAll();
	}

}
