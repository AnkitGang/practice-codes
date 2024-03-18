package com.PVR.bookingSystem.movies.dto;

public class AudiDTO {
	private int capacity;
	private TicketDTO[] tickets;
	
	public AudiDTO() {
		capacity = 5;
		tickets = new TicketDTO[capacity];
		for(int i=0; i<tickets.length; i++) {
			tickets[i] = new TicketDTO();
		}
	}
	
	public boolean isHallFull() {
		for(int i=0; i<tickets.length; i++) {
			TicketDTO obj = tickets[i];
			if(obj.getSeatNumber() == null)
				return false;
		}
		return true;
	}
	
	public void bookTicket(int seatNo) {
		if(seatNo<1 || seatNo>tickets.length) {
			System.out.println("Invalid Seat Number");
			return;
		}
		
		if(isHallFull()) {
			System.out.println("Hall Full...");
			return;
		}
		
		for(int i=0; i<tickets.length; i++) {
			TicketDTO obj = tickets[i];
			if(obj.getSeatNumber() != null && obj.getSeatNumber().equals("" + seatNo)) {
				System.out.println("Seat Already Booked...");
				return;
			}
			if(obj.getSeatNumber() == null) {
				obj.setSeatNumber("" + seatNo);
				System.out.println("Seat Booked...");
				return;
			}
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public TicketDTO[] getTickets() {
		return tickets;
	}

	public void setTickets(TicketDTO[] tickets) {
		this.tickets = tickets;
	}
	
	
}
