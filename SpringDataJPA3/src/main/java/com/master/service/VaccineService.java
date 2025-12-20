package com.master.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties) {
		Sort sort= Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public List<Vaccine> fetchDetailsByPaging(int pageNo, int pageSize, boolean status, String... properties) {
		Sort sort= Sort.by(status?Direction.ASC:Direction.DESC, properties);
		PageRequest pagable = PageRequest.of(pageNo, pageSize, sort);
		
		Page<Vaccine> page = repo.findAll(pagable);
		return page.getContent();
	}

	@Override
	public void fetchDetailsByPagination(int pageSize) {
		long count=6l;
		
		long pageCount = count/pageSize;
		
		pageCount = count % pageSize==0?pageCount:++pageCount;
		
		for (int i = 0; i <pageCount; i++) {
			PageRequest pagable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pagable);
			page
			.getContent()
			.forEach(v->System.out.println(v));
			System.out.println("--------------------------------------------------------");
		}
	}



}
