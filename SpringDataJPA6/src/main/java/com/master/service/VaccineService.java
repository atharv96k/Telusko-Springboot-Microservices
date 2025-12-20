package com.master.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
 
import com.master.repo.IVaccineRepo; 
import com.master.view.View;

@Service
public class VaccineService implements IVaccineService {

	public IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo) {
		this.repo = repo;
	}

	@Override
	public<T extends View> List<T> fetchByCost(Double cost, Class<T> cls) { 
		return repo.findByCostLessThan(cost, cls);
	}

}
