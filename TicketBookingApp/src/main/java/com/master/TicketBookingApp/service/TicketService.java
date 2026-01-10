package com.master.TicketBookingApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.TicketBookingApp.model.Passanger;
import com.master.TicketBookingApp.repo.ITicketRepo;

@Service
public class TicketService implements ITicketService {
	
	@Autowired
	private ITicketRepo repo;

	@Override
	public Passanger registerPassanger(Passanger passanger) {  
		return repo.save(passanger);
	}

	@Override
	public Passanger fetchPassangerInfo(Integer id) { 
		Optional<Passanger> pass = repo.findById(id);
		return pass.get();
	}

}
