package com.edsk.movie.service;

import java.util.List;

import com.edsk.movie.dto.ReviewCommentDTO;
import com.edsk.movie.dto.ReviewDTO;
import com.edsk.movie.dto.ReviewLikeDTO;

public interface ReviewService {
	
	/*Review*/
	public void insertReview(ReviewDTO dto) throws Exception;
	public void updateReview(ReviewDTO dto) throws Exception;
	public void deleteReview(int r_num) throws Exception;
	public List<ReviewDTO> selectReviewList() throws Exception;
	public ReviewDTO selectReview(int r_num) throws Exception;
	
	// 리뷰 조회수 증가
	public void updateReviewR_COUNT(int r_num) throws Exception;
	
	// 리뷰 추천수 증가
	public void updateReviewR_Like(int r_num) throws Exception;
	
	/*ReviewComment*/
	public void insertReviewComment(ReviewCommentDTO dto) throws Exception;
	public void updateReviewComment(ReviewCommentDTO dto) throws Exception;
	public void deleteReviewComment(int rc_num) throws Exception;
	public List<ReviewCommentDTO> selectReviewCommentList(int r_num) throws Exception;
	
	/*ReviewLike*/
	// 해당 리뷰에 대해 추천
	public boolean insertReviewLike(ReviewLikeDTO dto) throws Exception;
	
	// 해당 리뷰글에 대한 회원의 추천 여부 확인 (0: 추천 하지 않았음. 1: 이미 추천 했음)
	public int selectReviewLike(ReviewLikeDTO dto) throws Exception;
	
	
}

