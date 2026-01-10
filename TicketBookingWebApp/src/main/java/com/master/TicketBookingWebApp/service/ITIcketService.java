package com.master.TicketBookingWebApp.service;

import com.master.TicketBookingWebApp.model.Passanger;
import com.master.TicketBookingWebApp.model.Ticket;

public interface ITIcketService {

	public Integer registerPassanger(Passanger passanger);
	
	public Ticket getFullTicket(Integer idInteger);
}
