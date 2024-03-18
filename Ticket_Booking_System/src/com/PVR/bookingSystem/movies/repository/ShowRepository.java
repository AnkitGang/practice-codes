package com.PVR.bookingSystem.movies.repository;

import com.PVR.bookingSystem.movies.dto.MovieDTO;
import com.PVR.bookingSystem.movies.dto.ShowDTO;

public class ShowRepository {
	private AudiRepository audi = new AudiRepository();
	public ShowDTO addShow(MovieDTO movie) {
		ShowDTO showDTO = new ShowDTO();
		
		showDTO.setTiming("6:00PM");
		showDTO.setAudiDTO(audi.addAudi(showDTO));
		movie.setShow(showDTO);
		return showDTO;
	}
	
	public boolean removeShow(MovieDTO movie) {
		return false;
	}
}
