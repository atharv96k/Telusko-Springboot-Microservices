package com.master.service;

import java.util.List;

import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Sort;

import com.master.entity.Vaccine;

public interface IVaccineService {
		
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status,String... properties);
	
	public List<Vaccine> fetchDetailsByPaging(int pageNo, int pageSize,boolean status, String... properties);
	
	public void fetchDetailsByPagination(int pageSize);
}
