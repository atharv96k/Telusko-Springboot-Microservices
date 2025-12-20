package com.master.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.master.entity.Vaccine;
import com.master.repo.IVaccineRepo;  

@Service
public class VaccineService implements IVaccineService {

	public IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo) {
		this.repo = repo;
	}
	// Fetches all vaccines with the exact specified cost
	@Override
	public List<Vaccine> fetchByCost(Double cost) {
	    return repo.findByCost(cost);
	}

	// Fetches all vaccines with cost greater than the given value
	@Override
	public List<Vaccine> fetchByCostGreaterThan(Double cost) {
	    return repo.findByCostGreaterThan(cost);
	}

	// Fetches all vaccines with cost greater than or equal to the given value
	@Override
	public List<Vaccine> fetchByCostGreaterThanEqual(Double cost) {
	    return repo.findByCostGreaterThanEqual(cost);
	}

	// Fetches all vaccines with cost less than the given value
	@Override
	public List<Vaccine> fetchByCostLessThan(Double cost) {
	    return repo.findByCostLessThan(cost);
	}

	// Fetches all vaccines with cost less than or equal to the given value
	@Override
	public List<Vaccine> fetchByCostLessThanEqual(Double cost) {
	    return repo.findByCostLessThanEqual(cost);
	}

	// Fetches all vaccines whose cost lies between the given start and end values
	@Override
	public List<Vaccine> fetchByCostBetween(Double sCost, Double eCost) {
	    return repo.findByCostBetween(sCost, eCost);
	}

	// Fetches all vaccines whose cost is not equal to the given value
	@Override
	public List<Vaccine> fetchByCostNot(Double cost) {
	    return repo.findByCostNot(cost);
	}

	// Fetches all vaccines whose cost matches any value in the given list
	@Override
	public List<Vaccine> fetchByCostIn(List<Double> costs) {
	    return repo.findByCostIn(costs);
	}

	// Fetches all vaccines where the cost value is NULL
	@Override
	public List<Vaccine> fetchByCostIsNull() {
	    return repo.findByCostIsNull();
	}

	// Fetches all vaccines where the cost value is NOT NULL
	@Override
	public List<Vaccine> fetchByCostIsNotNull() {
	    return repo.findByCostIsNotNull();
	}

}
