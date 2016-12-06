package com.edsk.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsk.movie.dao.CinemaDAO;
import com.edsk.movie.dto.CinemaDTO;

@Service
public class CinemaServiceImpl implements CinemaService{

	@Autowired
	private CinemaDAO cinemaDAO;
	
	@Override
	public List<CinemaDTO> selectCinemaList() throws Exception {
		return cinemaDAO.selectCinemaList();
	}
	
	@Override
	public int writeCinema(CinemaDTO cinemaDTO) throws Exception {
		int writeResult = 0;
		writeResult = cinemaDAO.writeCinema(cinemaDTO);
		System.out.println("writeResult = "+writeResult);
		return cinemaDAO.writeCinema(cinemaDTO);
	}

}
