package com.master.TicketBookingWebApp.service;

import com.master.TicketBookingWebApp.model.Passenger;
import com.master.TicketBookingWebApp.model.Ticket;

public interface ITIcketService {

	public Integer registerPassanger(Passenger passanger);
	
	public Ticket getFullTicket(Integer idInteger);
}
