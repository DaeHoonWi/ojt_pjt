package com.edsk.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.ReviewCommentDTO;
import com.edsk.movie.dto.ReviewDTO;

@Repository("reviewCommentDAO")
public class ReviewCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "ReviewComment.";

	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 댓글 리스트 조회
	 * @param rNum : 리뷰 번호
	 * @return :  리뷰 댓글 리스트
	 * @throws Exception
	 */
	public List<ReviewCommentDTO> selectReviewCommentList(int rNum) throws Exception{
		return sqlSession.selectList(ns+"selectReviewCommentList", rNum);
	}
	
	/**
	 * 리뷰 댓글 삽입
	 * @param dto : ReviewCommentDTO
	 * @throws Exception
	 */
	public int insertReviewComment(ReviewCommentDTO dto) throws Exception{
		return sqlSession.insert(ns+"insertReviewComment", dto);
	}
	
	// 
	/**
	 * 리뷰 댓글 수정
	 * @param dto : ReviewCommentDTO
	 * @return : 
	 * @throws Exception
	 */
	public int updateReviewComment(ReviewCommentDTO dto) throws Exception{
		/*int updateResult = 0;
		updateResult = sqlSession.update(ns+"updateReviewComment", dto);*/
		return sqlSession.update(ns+"updateReviewComment", dto);
	}
	
	/**
	 * 리뷰 댓글 삭제
	 * @param rcNum : 리뷰 번호
	 * @throws Exception
	 */
	public int deleteReviewComment(int rcNum) throws Exception{
		return sqlSession.delete(ns+"deleteReviewComment", rcNum);
	}
	
	
}
