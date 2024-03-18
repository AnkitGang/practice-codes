package com.PVR.bookingSystem.movies.repository;

import com.PVR.bookingSystem.movies.dto.MovieDTO;

public class MovieRepository {
	private ShowRepository showRepo;
	MovieDTO[] movies;
	
	public MovieDTO[] getAllMovies() {
		if(movies != null)
			return movies;
		
		MovieDTO movies[] = new MovieDTO[2];
		MovieDTO movie = new MovieDTO();
		movie.setName("Pushpa");
		movie.setPrice(200);
		movie.setDesc("In Hindi");
		movie.setRating(8.5);
		
		showRepo.addShow(movie);
		movies[0] = movie;
		//movies[1] = new MovieDTO("KGF", 300, "In Hindi", 8.6);
		return movies;
	}
}
