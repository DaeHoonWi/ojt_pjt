package com.edsk.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.CinemaDTO;

/**
 * @author DaeHoon Wi
 * 
 * DB에 접근하여 데이터를 CRUD 하는 클래스
 */
@Repository
public class CinemaDAO {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "Cinema."; /*ns = nameSpace*/
	
	
	/**
	 * @return
	 * @throws Exception
	 * 영화정보를 select 하는 메소드
	 */
	public List<CinemaDTO> cinemaList() throws Exception{
		return sqlSession.selectList(ns+"selectCinemaList");
	}
	
	/**
	 * @param cinemaDTO
	 * @return
	 * @throws Exception
	 * 영화정보를 insert하는 메소드
	 */
	public int writeCinema(CinemaDTO cinemaDTO) throws Exception{
		sqlSession.insert(ns+"writeCinema", cinemaDTO);
		return 1;
	}
}
