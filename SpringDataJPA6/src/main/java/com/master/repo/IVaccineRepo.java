package com.master.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.master.entity.Vaccine; 
import com.master.view.View;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	public<T extends View>List<T> findByCostLessThan(Double cost, Class<T> cls);
	
}
