package com.master.service;

import java.util.List;

import com.master.entity.Vaccine;

public interface IVaccineService {
		
	public Vaccine searchVaccineByID(Integer id); 

	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac); 
	
	public String removeVaccineInBatch(Iterable<Integer> ids);

}
