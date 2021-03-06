package com.edsk.movie.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsk.movie.dao.CinemaDAO;
import com.edsk.movie.dto.CinemaDTO;

/************************************************
* <pre>
* 서비스 구현 클래스 CinemaService인터페이스를 상속받음
* </pre>
* @Company : (주)한국이디에스
* @Author  : 위대훈
* @Date    : 2016. 12. 7. 오후 8:30:49
* @Version : 1.0
* @MovieTeamProject 게시판
*************************************************/
@Service
public class CinemaServiceImpl implements CinemaService {

	/**
	 * DAO를 사용하여 DB에 값을 입력함. DB에서 정보를 입출력하는 코드는 DAO에 있음.
	 */
	@Autowired
	private CinemaDAO cinemaDAO;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edsk.movie.service.CinemaService#selectCinemaList() 
	 * 영화 리스트 출력 서비스
	 */
	@Override
	public List<CinemaDTO> selectCinemaList() throws Exception {
		List<CinemaDTO> cinemaListDTO = cinemaDAO.cinemaList();
		return cinemaListDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edsk.movie.service.CinemaService#writeCinema(javax.servlet.http.HttpServletRequest) 
	 * 영화 추가 서비스
	 * 1. 각 변수를 입력받음, 값이 있는지 value값을 체크한다. 없을 시 null.
	 * 2. 받은 변수를 DTO 객체에 저장한다.
	 * 3. DTO를 DAO에게 넘긴다.
	 * 4. DAO는 DTO 정보를 받고 DB에 입력한뒤 1(임시)을 반환한다.
	 * 
	 * *cCount는 입력하지 않는다. 입력하지 않을 시, 디폴트 값인 0이 들어간다.
	 * *cStoredFileName은 setcOriginalFileName을 변조하여 입력될 에정이다. 현재는 null (미구현/161207)
	 */
	@Override
	public int writeCinema(HttpServletRequest request) throws Exception {

		int writeResult = 0;//여기서 0으로 초기화 하면 계속 입력횟수 카운트가 안됨.. [수정이 필요함]
		
		CinemaDTO cinemaDTO = new CinemaDTO();
		
		int couNum = Integer.valueOf(request.getParameter("couNum"));
		String cTitle = String.valueOf(request.getParameter("cTitle"));
		int cRunningtime = Integer.valueOf(request.getParameter("cRunningtime"));
		String cSummary = String.valueOf(request.getParameter("cSummary"));
		String cAge = String.valueOf(request.getParameter("cAge"));
		
		String cOriginalFileName = String.valueOf(request.getParameter("cOriginalFileName"));
		int cPlaydate = Integer.valueOf(request.getParameter("cPlaydate"));


		cinemaDTO.setcouNum(couNum);
		cinemaDTO.setcTitle(cTitle);
		cinemaDTO.setcRunningtime(cRunningtime);
		cinemaDTO.setcSummary(cSummary);
		cinemaDTO.setcAge(cAge);

		cinemaDTO.setcOriginalFileName(cOriginalFileName);
		cinemaDTO.setcPlaydate(cPlaydate);

//		처음 방식
//		cinemaDTO.setcouNum(Integer.parseInt(request.getParameter("couNum")));
//		cinemaDTO.setcTitle(request.getParameter("cTitle"));
//		cinemaDTO.setcRunningtime(Integer.parseInt(request.getParameter("cRunningtime")));
//		cinemaDTO.setcSummary(request.getParameter("cSummary"));
//		cinemaDTO.setcCount(Integer.parseInt(request.getParameter("cCount")));
//		cinemaDTO.setcAge(request.getParameter("cAge"));
//		cinemaDTO.setcOriginalFileName(request.getParameter("cOriginalFileName"));
//		cinemaDTO.setcStoredFileName(request.getParameter("cStoredFileName"));
		

		writeResult = cinemaDAO.writeCinema(cinemaDTO);
		System.out.println("writeResult = " + writeResult);
		return writeResult;
	}

	/* (non-Javadoc)
	 * @see com.edsk.movie.service.CinemaService#selectCinemaDitail(int)
	 * 영화 상세보기 서비스
	 */
	@Override
	public CinemaDTO selectCinemaDetail(int cNum) throws Exception {
		CinemaDTO cinemaDTO = new CinemaDTO();
		cinemaDTO = cinemaDAO.cinemaDetail(cNum);
		return cinemaDTO;
	}

	@Override
	public int deleteCinema(int cNum) throws Exception {
		cinemaDAO.deleteCinema(cNum);
		return 1;
	}

	@Override
	public int updateCinema(HttpServletRequest request)
			throws Exception {
		
		CinemaDTO cinemaDTO = new CinemaDTO();
		
		int cNum = Integer.valueOf(request.getParameter("cNum"));
		int couNum = Integer.valueOf(request.getParameter("couNum"));
		String cTitle = String.valueOf(request.getParameter("cTitle"));
		int cRunningtime = Integer.valueOf(request.getParameter("cRunningtime"));
		String cSummary = String.valueOf(request.getParameter("cSummary"));

		String cAge = String.valueOf(request.getParameter("cAge"));
		String cOriginalFileName = String.valueOf(request.getParameter("cOriginalFileName"));
		int cPlaydate = Integer.valueOf(request.getParameter("cPlaydate"));


		cinemaDTO.setcNum(cNum);
		cinemaDTO.setcouNum(couNum);
		cinemaDTO.setcTitle(cTitle);
		cinemaDTO.setcRunningtime(cRunningtime);
		cinemaDTO.setcSummary(cSummary);
		
		cinemaDTO.setcAge(cAge);
		cinemaDTO.setcOriginalFileName(cOriginalFileName);
		cinemaDTO.setcPlaydate(cPlaydate);

		cinemaDAO.updateCinema(cinemaDTO);
		return 1;
	}

	
}
