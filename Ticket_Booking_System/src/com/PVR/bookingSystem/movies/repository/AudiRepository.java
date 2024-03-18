package com.PVR.bookingSystem.movies.repository;

import com.PVR.bookingSystem.movies.dto.AudiDTO;
import com.PVR.bookingSystem.movies.dto.ShowDTO;

public class AudiRepository {
	public TicketRepository ticketRepo;
	public AudiDTO addAudi(ShowDTO showDTO) {
		AudiDTO audi = new AudiDTO();
		
		audi.setCapacity(10);
		audi.setTickets(ticketRepo.addTickets(audi));
		return audi;
	}
}
