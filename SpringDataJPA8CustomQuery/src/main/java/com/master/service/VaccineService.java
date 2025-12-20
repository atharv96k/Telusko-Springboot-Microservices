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

	@Override
	public List<Vaccine> fetchByVaccineCompany(String company) {
		return repo.searchByVaccineCompany(company);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
		return repo.searchByVaccineCompany(comp1, comp2);
	}

	@Override
	public List<String> fetchByCostBetween(Double sCost, Double eCost) {
		return repo.searchByCostBetween(sCost, eCost);
	}

	@Override
	public int updateThePriceByVaccineName(Double uPrice, String vaccineName) {
		return repo.updatePriceByVaccineName(uPrice, vaccineName);
	}

	@Override
	public int deleteByVaccineName(String vaccineName) {
		return repo.deleteByVaccineName(vaccineName);
	}

	@Override
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost) {
		return repo.insertData(id,vaccineName, vaccineCompany, cost);
	}
	

}
