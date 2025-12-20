package com.master.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.master.entity.Vaccine; 

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	public List<Vaccine> findByCostGreaterThanEqual(Double cost);         // >=
	public List<Vaccine> findByCostGreaterThan(Double cost);              // >
	public List<Vaccine> findByCostLessThan(Double cost);                 // <
	public List<Vaccine> findByCostLessThanEqual(Double cost);            // <=
	public List<Vaccine> findByCostBetween(Double startCost, Double endCost); // BETWEEN
	public List<Vaccine> findByCost(Double cost);                         // =
	public List<Vaccine> findByCostNot(Double cost);                      // !=
	public List<Vaccine> findByCostIn(List<Double> costs);                // IN (...)
	public List<Vaccine> findByCostIsNull();                              // IS NULL
	public List<Vaccine> findByCostIsNotNull();   						  // IS NOT NULL
}
