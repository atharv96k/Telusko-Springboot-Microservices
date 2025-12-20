package com.master;
 
 

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
 
import com.master.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa4Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa4Application.class, args);
		
	VaccineService service = container.getBean(VaccineService.class);
		
	service.fetchByCost(2000.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostGreaterThan(2500.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostGreaterThanEqual(3000.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostLessThan(1800.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostLessThanEqual(2000.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostBetween(3000.0, 5000.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostNot(1500.0)
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostIn(List.of(1200.0, 1800.0, 3400.0))
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostIsNull()
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	service.fetchByCostIsNotNull()
	       .forEach(v -> System.out.println(v));
	System.out.println("------------------------------------------------------------------");

	}	
}
