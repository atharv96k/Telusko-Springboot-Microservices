package com.master.APIGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateWayApplication {
//Need To Start Eureka , Microservice01, Microservice02
	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayApplication.class, args);
	}

}
