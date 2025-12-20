package com.master.service;

import java.util.List;

import com.master.entity.Vaccine;

public interface IVaccineService {
	
	public List<Vaccine> fetchByVaccineCompany(String company);
	
	public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);
	
	public List<String> fetchByCostBetween(Double sCost,Double eCost);
	
	public int updateThePriceByVaccineName(Double uPrice,String vaccineName);
 
	public int deleteByVaccineName(String vaccineName);
	
	public int insertVaccineDetails(Integer id,String vaccineName,String vaccineCompany, Double cost);
}
