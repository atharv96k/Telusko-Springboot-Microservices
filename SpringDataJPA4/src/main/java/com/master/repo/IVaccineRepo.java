package com.master.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.master.entity.Vaccine;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

}
