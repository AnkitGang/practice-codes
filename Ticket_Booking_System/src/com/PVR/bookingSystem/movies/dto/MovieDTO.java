package com.PVR.bookingSystem.movies.dto;

public class MovieDTO {
	private String name;
	private double rating;
	private String desc;
	private ShowDTO show;
	private double price;
	
	public ShowDTO getShow() {
		return show;
	}

	public void setShow(ShowDTO show) {
		this.show = show;
	}

	public MovieDTO() {
		
	}
	
	public MovieDTO(String name, double rating, String desc, double price) {
		super();
		this.name = name;
		this.rating = rating;
		this.desc = desc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {  //to print output in meaningful manner when object is called to print
		return "MovieDTO [name=" + name + ", rating=" + rating + ", desc=" + desc + ", price=" + price + "]";
	}
	
	
}
