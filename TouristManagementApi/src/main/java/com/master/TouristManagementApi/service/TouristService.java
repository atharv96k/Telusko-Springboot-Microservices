package com.master.TouristManagementApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.master.TouristManagementApi.dao.ITouristRepo;
import com.master.TouristManagementApi.exception.TouristNotFoundException;
import com.master.TouristManagementApi.model.Tourist;

@Service
@Scope("prototype")
public class TouristService implements ITouristService {

	@Autowired
	private ITouristRepo repo;
	
	public TouristService() {
		System.out.println("TouristService bean is created");
	}
	
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

	@Override
	public String updateTourist(Tourist tourist) {
		Optional<Tourist> optional = repo.findById(tourist.getId());
		if (optional.isPresent()) { 
			repo.save(tourist);
			return "Tourist Info Updated Successfully!";
		}else {
			throw new TouristNotFoundException("Tourist with given id is not exist!");
		}
	}

	public String updateTouristBudget(Integer id, Double budget) {
		Optional<Tourist> optional = repo.findById(id);
		if (optional.isPresent()) {
			Tourist tourist = optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Tourist Budget Updated Successfully!";
		}else {
			throw new TouristNotFoundException("Tourist with given id is not exist!");
		}
	}

	@Override
	public String deleteTouristInfoByID(Integer id) {
		repo.deleteById(id);
		return "Torist Information deleted successfully!";
	}

}
