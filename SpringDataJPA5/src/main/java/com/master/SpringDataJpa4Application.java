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
public class SpringDataJpa4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa4Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);
		
		service.fetchByCost(10000.0).forEach(v->System.out.println(v.getId() + " " + v.getVaccineName()+" "+v.getVaccineCompany()));
	}
}
