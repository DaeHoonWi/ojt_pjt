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
	
	/**
	 * 모든 리뷰 리스트 조회
	 * @return : 리뷰 리스트 
	 * @throws Exception
	 */
	public List<ReviewDTO> selectReviewList() throws Exception{
		return sqlSession.selectList(ns+"selectReviewList");
	}
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 조회
	 * @param rNum : 리뷰 번호 ( Review Table의 Primary key ) 
	 * @return : ReviewDTO
	 * @throws Exception 
	 */
	public ReviewDTO selectReview(int rNum) throws Exception{
		return sqlSession.selectOne(ns+"selectReview", rNum);
	}
	
	/**
	 * 리뷰 입력
	 * @param dto : ReviewDTO
	 * @return 
	 * @throws Exception
	 */
	public int insertReview(ReviewDTO dto) throws Exception{
		return sqlSession.insert(ns+"insertReview", dto);
	}
	
	/**
	 * 리뷰 수정 
	 * @param dto : ReviewDTO
	 * @throws Exception
	 */
	public int updateReview(ReviewDTO dto) throws Exception{
		return sqlSession.update(ns+"updateReview", dto);
	}
	
	/**
	 * 리뷰 조회수 증가(+1)
	 * @param rNum : 리뷰 번호
	 * @throws Exception
	 */
	public int updateReviewR_COUNT(int rNum) throws Exception{
		return sqlSession.update(ns+"updateReviewR_COUNT", rNum);
	}
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 추천수 증가(+1)
	 * (리뷰 추천 시  selectReviewLike, insertReviewLike, updateReviewR_Like 순서로 실행) 
	 * @param rNum : 리뷰 번호 
	 * @throws Exception
	 */
	public int updateReviewR_Like(int rNum) throws Exception{
		return sqlSession.update(ns+"updateReviewR_Like", rNum);
	}
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 삭제 
	 * @param rNum : 리뷰 번호
	 * @throws Exception
	 */
	public int deleteReview(int rNum) throws Exception{
		return sqlSession.delete(ns+"deleteReview", rNum);
	}
	
	
	
	
	
}
