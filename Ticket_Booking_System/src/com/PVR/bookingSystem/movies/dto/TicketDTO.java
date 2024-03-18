package com.PVR.bookingSystem.movies.dto;

public class TicketDTO {
	private String seatNumber;
	private String timing;
	private double price;
	
	public TicketDTO() {
		timing = "10.00 AM";
		price = 200;
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
