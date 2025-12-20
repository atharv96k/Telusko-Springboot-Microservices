package com.master.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.master.entity.Vaccine;
import com.master.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	public List<ResultView> findByCostLessThan(Double cost);
	
}
