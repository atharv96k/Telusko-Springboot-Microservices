package com.master.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public Vaccine searchVaccineByID(Integer id) {
		return repo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac) {
		Example<Vaccine> example = Example.of(vac);
		return repo.findAll(example);
	}

	@Override
	public String removeVaccineInBatch(Iterable<Integer> ids) {
		List<Vaccine> lst = repo.findAllById(ids);
		
		if (lst.size()!=0) {
			repo.deleteAllInBatch(lst);
			return "Deletion Successful!";
		}
		return "Deletion Failed";
	}

}
