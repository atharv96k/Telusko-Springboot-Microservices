package com.master.TicketBookingApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.master.TicketBookingApp.model.Passanger;
import com.master.TicketBookingApp.model.Ticket;
import com.master.TicketBookingApp.service.ITicketService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequestMapping("api/book-ticket")
@Tag(name = "Ticket Management", description = "APIs for Passenger Registration and Ticket Retrieval")
public class TicketController {

	@Autowired
	private ITicketService service;
	
	@PostMapping("/get-ticketNum")
	@Operation(summary = "Register a Passenger", description = "Stores passenger details and returns a unique Ticket Number (PID).")
	@ApiResponse(responseCode = "201", description = "Passenger successfully registered")
	public ResponseEntity<Integer> registerPassanger(@RequestBody Passanger passanger){
		Passanger registeredPass = service.registerPassanger(passanger);
		Integer ticketNumber = registeredPass.getPid();
		return new ResponseEntity<Integer>(ticketNumber,HttpStatus.CREATED);
	}
	
	@GetMapping("/get-ticket/{ticketNumber}")
	@Operation(summary = "Get Ticket Details", description = "Fetches complete ticket information using the Ticket Number (PID).")
	@ApiResponse(responseCode = "200", description = "Ticket found and returned")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNumber") Integer ticketNumber)
	{
		Passanger fetchedPassanger = service.fetchPassangerInfo(ticketNumber);
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(fetchedPassanger.getPid());
		ticket.setName(fetchedPassanger.getName());
		ticket.setDeparture(fetchedPassanger.getDeparture());
		ticket.setArrival(fetchedPassanger.getArrival());
		ticket.setDateOfJourney(fetchedPassanger.getDateOfJourney());
		ticket.setStatus("Confirmed!");
		ticket.setTicketPrice(5999.9);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
}
