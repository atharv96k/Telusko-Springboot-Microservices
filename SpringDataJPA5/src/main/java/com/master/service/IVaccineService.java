package com.master.service;

import java.util.List;

import com.master.entity.Vaccine;
import com.master.view.ResultView;

public interface IVaccineService {
	
	public List<ResultView> fetchByCost(Double cost);
		
}
