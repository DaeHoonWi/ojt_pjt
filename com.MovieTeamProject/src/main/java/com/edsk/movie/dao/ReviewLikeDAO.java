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
	
	/**
	 * 리뷰 추천 여부 확인 (0 : 해당 리뷰에 대한 추천을 하지 않았음. 1: 해당 리뷰에 대해 이미 추천함)
	 * @param dto : ReviewLikeDTO
	 * @return : ReviewLike Table에 회원이 해당 리뷰를 추천했는지 조회 후 데이터의 수를 리턴.
	 * @throws Exception
	 */
	public int selectReviewLike(ReviewLikeDTO dto) throws Exception{
		return sqlSession.selectOne(ns+"selectReviewLike", dto);
	}
	
	/**
	 * 리뷰 추천시 관련 데이터(추천한 리뷰번호, 추천한 회원, 추천한 날짜) 삽입
	 * @param dto : ReviewLikeDTO
	 * @throws Exception
	 */
	public int insertReviewLike(ReviewLikeDTO dto) throws Exception{
		return sqlSession.insert(ns+"insertReviewLike", dto);
	}
	

	/* 일정기간내(sysdate 이전 달) 추천이 가장 많은 리뷰 리스트 뽑기 
	public List<ReviewDTO> selectPopularReview() throws Exception{
		
	}
	*/
}
