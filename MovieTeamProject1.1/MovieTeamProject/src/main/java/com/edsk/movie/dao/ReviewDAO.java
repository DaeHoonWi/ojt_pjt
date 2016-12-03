package com.edsk.movie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.ReviewDTO;

@Repository("reviewDAO")
public class ReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String ns = "Review.";
	
	public boolean insertReview(ReviewDTO dto) throws Exception{
		sqlSession.insert(ns+"insertReview", dto);
		return true;
	}
	
}