package com.edsk.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.ReviewDTO;

@Repository("reviewDAO")
public class ReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String ns = "Review.";
	
	public void insertReview(ReviewDTO dto) throws Exception{
		sqlSession.insert(ns+"insertReview", dto);
	}
	
	public ReviewDTO selectReview(int r_num) throws Exception{
		return sqlSession.selectOne(ns+"selectReview", r_num);
	}
	
	public List<ReviewDTO> selectReviewList() throws Exception{
		return sqlSession.selectList(ns+"selectReviewList");
	}
	
	public void updateReview(ReviewDTO dto) throws Exception{
		sqlSession.update(ns+"updateReview", dto);
	}
	
	public void updateReviewR_COUNT(int r_num) throws Exception{
		sqlSession.update(ns+"updateReviewR_COUNT", r_num);
	}
	
	// 리뷰 추천 : 추천 시  insertReviewLike, updateReviewR_Like 이 실행
	public void updateReviewR_Like(int r_num) throws Exception{
		sqlSession.update(ns+"updateReviewR_Like", r_num);
	}
	
	public void deleteReview(int r_num) throws Exception{
		sqlSession.delete(ns+"deleteReview", r_num);
	}
	
	
	
	
	
}
