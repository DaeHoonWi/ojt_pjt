package com.edsk.movie.service;

import java.util.List;

import com.edsk.movie.dto.CinemaDTO;

public interface CinemaService {

	/*영화 목록*/
	public List<CinemaDTO> selectCinemaList() throws Exception;
	
	/*영화 추가*/
	public int writeCinema(CinemaDTO dto) throws Exception;
	
	/*영화 상세정보 보기*/
//	public List<CinemaDTO> cinemaDetailList() throws Exception;
	
	/*영화 정보 삭제*/
//	public void deleteDao(String c_num);
	
	/*영화 정보 수정*/
}
	