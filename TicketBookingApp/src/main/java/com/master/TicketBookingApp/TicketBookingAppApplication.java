package com.master.TicketBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	    info = @Info(
	        title = "Ticket Booking API",
	        version = "1.0",
	        description = "This API handles passenger registration and ticket generation for the TicketBookingApp.",
	        contact = @Contact(
	            name = "Atharv Mohite",
	            email = "support@master.com"
	        )
	    )
	)
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
