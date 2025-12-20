package com.master.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.master.entity.Vaccine;
import com.master.repo.IVaccineRepo;


@Service
public class VaccineService implements IVaccineService {

	private IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo) {
		this.repo = repo;
	}

	@Override
	public String registerVaccineInfo(Vaccine vaccine) {
		Vaccine vac = repo.save(vaccine);
		return "Vaccine Info registered with id "+vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines) {
		Iterable<Vaccine> vacs = repo.saveAll(vaccines);
		return vacs;
	}

	@Override
	public Long vaccineCount() {
		return repo.count();
	}

	@Override
	public Iterable<Vaccine> getAllVaccineInfo() {
		return repo.findAll();
	}

	@Override
	public Iterable<Vaccine> getAllVaccines(Iterable<Integer> ids) {
		return repo.findAllById(ids);
	}

	@Override
	public String removeVaccineById(Integer id) {
		Optional<Vaccine> op = repo.findById(id);
		if (op.isPresent()) {
			repo.deleteById(id);
			return "The Vaccine with id "+id+" has been deleted";
		}
		return "Unable to find vaccine record having id "+id;
	}

	@Override
	public String removeVaccineByVaccine(Vaccine obj) {
		int id=obj.getId();
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return "The Vaccine with id "+id+" has been deleted";
		}
		return "Unable to find vaccine record having id "+id;
	}

	@Override
	public String removeAllVaccines(List<Integer> ids) {
//		List<Vaccine> vaccines =(List<Vaccine>) repo.findAllById(ids);
		int count1 = ids.size();
//		int count2 = vaccines.size();
		
//		if (count1==count2) {
			if (count1 > 0) {
			repo.deleteAllById(ids);
			return "Deletion Completed";
		}
		return "Deletion Failed";
	}

//	@Override
//	public Boolean checkVaccineAvailability(Integer id) {
//		return repo.existsById(id);
//	}

}
