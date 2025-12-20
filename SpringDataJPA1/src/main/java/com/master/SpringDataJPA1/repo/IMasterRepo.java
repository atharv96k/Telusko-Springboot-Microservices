package com.master.SpringDataJPA1.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.master.SpringDataJPA1.enitity.Master;

import jakarta.persistence.Id;

@Repository
public interface IMasterRepo extends CrudRepository<Master, Integer> {

	
	
}
