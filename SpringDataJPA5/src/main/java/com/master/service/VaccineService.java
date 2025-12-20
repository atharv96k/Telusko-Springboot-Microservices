package com.master.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.master.entity.Vaccine;
import com.master.repo.IVaccineRepo;
import com.master.view.ResultView;

@Service
public class VaccineService implements IVaccineService {

	public IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<ResultView> fetchByCost(Double cost) {
		return repo.findByCostLessThan(cost);
	}


}
