package com.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
 
import com.master.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa8Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa8Application.class, args);
		
	VaccineService service = container.getBean(VaccineService.class);
//		service.fetchByVaccineCompany("BharatBio").forEach(v->System.out.println(v));

//		service.fetchByVaccineCompany("BharatBio","Serum Institute").forEach(v->System.out.println(v));
	
//	service.fetchByCostBetween(3000.0, 5000.0).forEach(v->System.out.println(v));
	
//		int rowsAffected = service.updateThePriceByVaccineName(5000.0, "Moderna");
//		if (rowsAffected>0) {
//			System.out.println("Price Updated Successfully!");
//		}else {
//			System.out.println("Updation Failure");
//		}
	
//	int rowsAffected = service.deleteByVaccineName("QazVac");
//	if (rowsAffected>0) {
//		System.out.println("Deletion Successfull!");
//	}else {
//		System.out.println("Error is occured during Deletion.");
//	}
	
	
	int rowsAffected = service.insertVaccineDetails(19,"QazVac","Ather",5999.0);
	if (rowsAffected>0) {
		System.out.println("Insertion Successfull!");
	}else {
		System.out.println("Error is occured while Inserting.");
	}
	}	
}
