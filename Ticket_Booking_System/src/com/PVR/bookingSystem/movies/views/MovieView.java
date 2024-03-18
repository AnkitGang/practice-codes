package com.PVR.bookingSystem.movies.views;

import java.util.Scanner;

import com.PVR.bookingSystem.movies.dto.MovieDTO;
import com.PVR.bookingSystem.movies.services.MovieService;

public class MovieView {
	public void showMovie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name: ");
		String movieName = sc.next();
		MovieService movieService = new MovieService();
		MovieDTO movieDTO = movieService.getMovieByName(movieName);
		if(movieDTO == null)
			System.out.println("No such movie exists.");
		else {
			System.out.println("Movie " + movieDTO);
			System.out.println("Enter the seat to book b/w 1 to 5");
			int seatNo = sc.nextInt();
			movieDTO.getShow().getAudiDTO().bookTicket(seatNo);
			System.out.println("After Booked " + movieDTO);
		}
		//sc.close();      //necessary not to close here
	}
}
