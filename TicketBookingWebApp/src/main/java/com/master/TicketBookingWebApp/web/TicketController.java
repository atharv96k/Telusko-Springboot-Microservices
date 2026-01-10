package com.master.TicketBookingWebApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.master.TicketBookingWebApp.model.Passanger;
import com.master.TicketBookingWebApp.model.Ticket;
import com.master.TicketBookingWebApp.service.ITIcketService;
 

@Controller
public class TicketController {

	private ITIcketService service;
	
	
	@GetMapping("/passanger-regform")
	public String bookTicketForm(@ModelAttribute Passanger passanger, Model model) 
	{
		model.addAttribute("passanger", passanger);
		return "index";
	}
	
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passanger passanger, Model model)
	{
		Integer ticket = service.registerPassanger(passanger);
		model.addAttribute("ticketNumbe", ticket);	
		return "index";
	}
	
	@GetMapping("/fetch-ticketf")
	public String fetchTicketForm(@ModelAttribute Passanger passanger, Model model) 
	{
		model.addAttribute("passanger", new Passanger());
		return "ticket-form";
	}
	
	@GetMapping("/get-ticket")
	public String getFullTicket(@RequestParam("ticketNumber") Integer ticketNumber, Model model)
	{
		
		Ticket ticket = service.getFullTicket(ticketNumber);
		model.addAttribute("ticket", ticket);
		
		return "ticket-info";
	}
}

