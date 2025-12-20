package com.master.service;

import com.master.entity.Vaccine; 
import java.util.List;
public interface IVaccineService {
	
	public String registerVaccineInfo(Vaccine vaccine);
	
	public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines);
	
	public Long vaccineCount();
	
//	public Boolean checkVaccineAvailability(Integer id);
	
	public Iterable<Vaccine> getAllVaccineInfo();
	
	public Iterable<Vaccine> getAllVaccines(Iterable<Integer> ids);
	
	public String removeVaccineById(Integer id);
	
	public String removeVaccineByVaccine(Vaccine obj);
	
	public String removeAllVaccines(List<Integer> vacs);

}
