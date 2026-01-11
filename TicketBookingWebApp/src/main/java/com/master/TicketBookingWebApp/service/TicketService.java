package com.master.TicketBookingWebApp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.master.TicketBookingWebApp.model.Passenger;
import com.master.TicketBookingWebApp.model.Ticket;

@Controller
public class TicketService implements ITIcketService {

	String post_url = "http://localhost:8484/TicketBookingApp/api/book-ticket/get-ticketNum";
	String get_url = "http://localhost:8484/TicketBookingApp/api/book-ticket/get-ticket/{ticketNumber}";
	@Override
	public Integer registerPassanger(Passenger passanger) { 
		
		//Using RestTemplate - Supports Only Synchronous Communication
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Integer> response = restTemplate.postForEntity(post_url, passanger, Integer.class);
//		Integer ticketNumber = response.getBody();
		
		//Using WebClient - Support Both Synchronous and Asynchronous Communication
		WebClient webcleint = WebClient.create();
		Integer ticketNumber = webcleint.post()
				.uri(post_url)
				.bodyValue(passanger)
				.retrieve()
				.bodyToMono(Integer.class)
				.block();
		
		return ticketNumber;
	}

	@Override
	public Ticket getFullTicket(Integer ticketNumber) {
		//Using RestTemplate
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Ticket> response = restTemplate.getForEntity(get_url, Ticket.class, ticketNumber);
//		Ticket ticket = response.getBody();
		
		//Using WebClient
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.get()
				.uri(get_url, ticketNumber)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		return ticket;
	}

}
