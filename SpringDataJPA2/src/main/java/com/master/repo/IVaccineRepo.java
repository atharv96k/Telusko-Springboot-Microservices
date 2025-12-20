package com.master.repo;

import org.springframework.data.repository.CrudRepository;

import com.master.entity.Vaccine;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
