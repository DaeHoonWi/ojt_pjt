package com.edsk.movie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.ReviewLikeDTO;

@Repository
public class ReviewLike {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "ReviewLike.";
	
	// 리뷰 추천 : 추천 시  insertReviewLike, updateReviewR_Like 이 실행
	public boolean insertReviewLike(ReviewLikeDTO dto) throws Exception{
		sqlSession.insert(ns+"insertReviewLike", dto);
		return true;
	}
	
	public int selectReviewLike(ReviewLikeDTO dto) throws Exception{
		return sqlSession.selectOne(ns+"selectReviewLike", dto);
	}
	
	
	
	
	
	
	
	
	
	
}

