package com.master.SpringAOPApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.SpringAOPApplication.model.Alien;

@Repository
public interface IAlienRepo extends JpaRepository<Alien, Integer> {

}
