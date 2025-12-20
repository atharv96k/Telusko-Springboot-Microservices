package com.master.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.master.entity.Vaccine;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

//	@Query("FROM Vaccine WHERE vaccineCompany =:companyName")
//	public List<Vaccine> searchByVaccineCompany(String companyName);
	
	@Query("FROM Vaccine WHERE vaccineCompany =:companyName")
	public List<Vaccine> searchByVaccineCompany(@Param("companyName")String company);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN(:comp1,:comp2)")
	public List<Vaccine> searchByVaccineCompany(String comp1,String comp2);
	
	@Query("SELECT vaccineName, vaccineCompany FROM Vaccine WHERE cost BETWEEN :sCost AND :eCost")
	public List<String> searchByCostBetween(Double sCost,Double eCost);
	
	
	@Transactional
	@Modifying
	@Query("UPDATE Vaccine SET cost=:uPrice where vaccineName=:vaccineName")
	public int updatePriceByVaccineName(Double uPrice,String vaccineName);//uPrice -> Updated Price
	
	@Transactional
	@Modifying
	@Query("DELETE FROM	 Vaccine where vaccineName=:vaccineName")
	public int deleteByVaccineName(String vaccineName);
	
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO Vaccine(`id`,`vaccine_name`,`vaccine_company`,`cost`) VALUES(?,?, ?, ?)",nativeQuery = true)
	public int insertData(Integer id,String vaccineName,String vaccineCompany, Double cost);
	
	
	
	
	
	
	
}
