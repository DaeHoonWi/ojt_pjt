package com.edsk.movie.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.edsk.movie.dto.CinemaDTO;

/**
 * @author DaeHoon Wi
 *
 * 영화정보 관련 서비스 인터페이스
 */
public interface CinemaService {

	/*영화 목록*/
	public List<CinemaDTO> selectCinemaList() throws Exception;
	
	/*영화 추가*/
	public int writeCinema(HttpServletRequest request) throws Exception;

	/*영화 상세보기*/
	public CinemaDTO selectCinemaDetail(int cNum) throws Exception;
	
	/*영화 정보 삭제*/
	public int deleteCinema(int cNum) throws Exception;
	
	/*영화 정보 수정*/
	public int updateCinema(HttpServletRequest request) throws Exception;
	
	
}
	