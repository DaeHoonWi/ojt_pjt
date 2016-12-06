package com.edsk.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.CinemaDTO;

/*용도 모름*/
@Repository
public class CinemaDAO {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "Cinema."; /*ns = nameSpace*/
	
	public List<CinemaDTO> selectCinemaList() throws Exception{
		return sqlSession.selectList(ns+"selectCinemaList");
	}
	
	public int writeCinema(CinemaDTO cinemaDTO) throws Exception{
		return sqlSession.insert(ns+"writeCinema", cinemaDTO);
	}
}
