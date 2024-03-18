package com.PVR.bookingSystem.movies.services;

import com.PVR.bookingSystem.movies.dto.MovieDTO;
import com.PVR.bookingSystem.movies.repository.MovieRepository;

public class MovieService {
	public MovieDTO getMovieByName(String movieName) {
		MovieRepository movieRepo = new MovieRepository();
		for(MovieDTO movieObject: movieRepo.getAllMovies()) {
			if(movieObject != null) {
				if(movieObject.getName().equalsIgnoreCase(movieName))
					return movieObject;
			}
		}
		return null;
	}
}
