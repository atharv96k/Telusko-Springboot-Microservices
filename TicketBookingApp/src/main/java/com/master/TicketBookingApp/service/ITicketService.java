package com.master.TicketBookingApp.service;

import com.master.TicketBookingApp.model.Passanger;

public interface ITicketService {

	Passanger registerPassanger(Passanger passanger);
	
	Passanger fetchPassangerInfo(Integer id);
}
