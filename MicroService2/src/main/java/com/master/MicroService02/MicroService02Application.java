package com.master.MicroService02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;   

@SpringBootApplication
@EnableDiscoveryClient
public class MicroService02Application { 
	
	public static void main(String[] args) {
		SpringApplication.run(MicroService02Application.class, args);
	} 
}
