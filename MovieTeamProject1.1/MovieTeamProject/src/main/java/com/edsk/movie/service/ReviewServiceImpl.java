package com.edsk.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsk.movie.dao.ReviewDAO;
import com.edsk.movie.dto.ReviewDTO;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	public ReviewDAO reviewDAO;
	
	@Override
	public boolean insertReview(ReviewDTO dto) throws Exception {
		return reviewDAO.insertReview(dto);
	}

	@Override
	public void updateReview(ReviewDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteReview(ReviewDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ReviewDTO> selectReviewList(ReviewDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReviewDTO selectReview(ReviewDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
