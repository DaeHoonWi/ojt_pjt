package com.edsk.movie.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.ReviewLikeDTO;

@Repository
public class ReviewLikeDAO {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "ReviewLike.";
	
	public void insertReviewLike(ReviewLikeDTO dto) throws Exception{
		sqlSession.insert(ns+"insertReviewLike", dto);
	}
	
	public int selectReviewLike(ReviewLikeDTO dto) throws Exception{
		return sqlSession.selectOne(ns+"selectReviewLike", dto);
	}
	
	
	/* 일정기간내(sysdate 이전 달) 추천이 가장 많은 리뷰 리스트 뽑기 
	public List<ReviewDTO> selectPopularReview() throws Exception{
		
	}
	*/
}
