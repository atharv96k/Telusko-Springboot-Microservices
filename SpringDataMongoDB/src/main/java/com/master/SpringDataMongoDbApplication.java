package com.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.master.dto.CustomerDTO;
import com.master.model.Customer;
import com.master.service.CustomerService;

@SpringBootApplication
public class SpringDataMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataMongoDbApplication.class, args);
		
		CustomerService service = container.getBean(CustomerService.class);
		
//		CustomerDTO cust1 = new CustomerDTO(101,"Shravan","Tasgaon");
//		CustomerDTO cust2 = new CustomerDTO(102,"Atharv","Sangali");
//		String status=service.registerCutomer(cust2);
		
//		System.out.println(status);
		
		String status = service.deleteDocument("694552d567e11617c0aac1ed");
		System.out.println(status);
		service.findAllCustomer().forEach(c->System.out.println(c));
		
		
	}

}
