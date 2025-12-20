package com.master.service;

import java.util.List;

import com.master.entity.Vaccine;

public interface IVaccineService {
	
	public List<Vaccine> fetchByCost(Double cost);

	public List<Vaccine> fetchByCostGreaterThan(Double cost);
	public List<Vaccine> fetchByCostGreaterThanEqual(Double cost);

	public List<Vaccine> fetchByCostLessThan(Double cost);
	public List<Vaccine> fetchByCostLessThanEqual(Double cost);

	public List<Vaccine> fetchByCostBetween(Double sCost, Double eCost);

	public List<Vaccine> fetchByCostNot(Double cost);

	public List<Vaccine> fetchByCostIn(List<Double> costs);

	public List<Vaccine> fetchByCostIsNull();
	public List<Vaccine> fetchByCostIsNotNull();
 
}
