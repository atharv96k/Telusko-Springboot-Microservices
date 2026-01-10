package com.master.TicketBookingApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.TicketBookingApp.model.Passanger;

public interface ITicketRepo extends JpaRepository<Passanger, Integer> {

}
