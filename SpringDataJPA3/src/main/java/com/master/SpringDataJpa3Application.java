package com.master;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.entity.Vaccine;
import com.master.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa3Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);
//		service.fetchDetailsBySorting(true, "id","vaccineName").forEach(v->System.out.println(v.getId()+" "+v.getVaccineName()));
//		
//		service.fetchDetailsByPaging(2,2,true,"vaccineName").forEach(v->System.out.println(v.getId()+" "+v.getVaccineName()));

		service.fetchDetailsByPagination(4);
	}

}
