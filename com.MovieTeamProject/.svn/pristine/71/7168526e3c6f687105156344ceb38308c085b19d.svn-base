package com.edsk.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edsk.movie.dto.ReviewCommentDTO;

@Repository
public class ReviewCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	private String ns = "ReviewComment.";
	
	// 리뷰 댓글 삽입
	public void insertReviewComment(ReviewCommentDTO dto) throws Exception{
		sqlSession.insert(ns+"insertReviewComment", dto);
	}
	
	// 해당 리뷰글에 대한 리뷰 댓글 리스트를 조회.
	public List<ReviewCommentDTO> selectReviewCommentList(int r_num) throws Exception{
		return sqlSession.selectList(ns+"selectReviewCommentList", r_num);
	}
	
	// 리뷰 댓글 수정
	public void updateReviewComment(ReviewCommentDTO dto) throws Exception{
		sqlSession.update(ns+"updateReviewComment", dto);
	}
	
	// 리뷰 댓글 삭제
	public void deleteReviewComment(int rc_num) throws Exception{
		sqlSession.delete(ns+"deleteReviewComment", rc_num);
	}
	
	
}
