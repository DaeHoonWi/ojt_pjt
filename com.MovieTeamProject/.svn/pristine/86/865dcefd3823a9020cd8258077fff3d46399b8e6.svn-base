package com.edsk.movie.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsk.movie.dao.CinemaDAO;
import com.edsk.movie.dto.CinemaDTO;

/**
 * @author DaeHoon Wi
 *
 * 
 *         서비스 구현 클래스 CinemaService인터페이스를 상속받음
 * 
 */
@Service
public class CinemaServiceImpl implements CinemaService {

	/**
	 * DAO를 사용하여 DB에 값을 입력함. DB에서 정보를 입출력하는 코드는 DAO에 있음.
	 */
	@Autowired
	private CinemaDAO cinemaDAO;

	/*
	 * @Autowired private CinemaService cinemaService;
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edsk.movie.service.CinemaService#selectCinemaList() 영화 리스트 출력
	 * 서비스
	 */
	@Override
	public List<CinemaDTO> selectCinemaList() throws Exception {
		return cinemaDAO.cinemaList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edsk.movie.service.CinemaService#writeCinema(javax.servlet.http.
	 * HttpServletRequest) 영화 추가 서비스
	 */
	@Override
	public int writeCinema(HttpServletRequest request) throws Exception {
		
		int writeResult = 0;

		CinemaDTO cinemaDTO = new CinemaDTO();

		cinemaDTO.setcouNum(Integer.parseInt(request.getParameter("couNum")));
		cinemaDTO.setcTitle(request.getParameter("cTitle"));
		cinemaDTO.setcRunningtime(Integer.parseInt(request
				.getParameter("cRunningtime")));
		cinemaDTO.setcSummary(request.getParameter("cSummary"));
		// cinemaDTO.setcCount(Integer.parseInt(request.getParameter("cCount")));

		cinemaDTO.setcAge(request.getParameter("cAge"));
		cinemaDTO.setcOriginalFileName(request
				.getParameter("cOriginalFileName"));
		// cinemaDTO.setcStoredFileName(request.getParameter("cStoredFileName"));
		// 현재는 입력 시 디폴트(null)으로 입력
		cinemaDTO.setcPlaydate(Integer.parseInt(request
				.getParameter("cPlaydate")));

		writeResult = cinemaDAO.writeCinema(cinemaDTO);
		System.out.println("writeResult = " + writeResult);
		return writeResult;
	}

}
