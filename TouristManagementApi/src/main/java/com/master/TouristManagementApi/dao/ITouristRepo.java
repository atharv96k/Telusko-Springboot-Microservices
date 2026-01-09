package com.master.TouristManagementApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.TouristManagementApi.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist,Integer> {

}
