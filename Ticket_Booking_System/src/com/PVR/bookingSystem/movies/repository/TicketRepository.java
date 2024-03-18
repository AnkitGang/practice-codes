package com.PVR.bookingSystem.movies.repository;

import com.PVR.bookingSystem.movies.dto.AudiDTO;
import com.PVR.bookingSystem.movies.dto.TicketDTO;

public class TicketRepository {
	public TicketDTO[] addTickets(AudiDTO audiDTO) {
		TicketDTO tickets[] = audiDTO.getTickets();
		return tickets;
	}
}
