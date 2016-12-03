package com.edsk.movie.service;

import java.util.List;

import com.edsk.movie.dto.ReviewDTO;

public interface ReviewService {
	
	public boolean insertReview(ReviewDTO dto) throws Exception;
	public void updateReview(ReviewDTO dto) throws Exception;
	public void deleteReview(ReviewDTO dto) throws Exception;
	public List<ReviewDTO> selectReviewList(ReviewDTO dto) throws Exception;
	public ReviewDTO selectReview(ReviewDTO dto) throws Exception;
	
}

