package com.master.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.master.entity.Vaccine;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

}
