package com.edsk.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edsk.movie.dto.ReviewDTO;
import com.edsk.movie.service.ReviewService;

@Controller
public class ReviewController {

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping(value="Reviewlist.do")
	public String main(Model model) throws Exception{
		logger.debug("Reiviewlist");
		
		ReviewDTO dto = new ReviewDTO();
		dto.setM_id("kay");
		dto.setR_title("kay_title");
		dto.setR_content("kay_content");
		dto.setC_num(12);
		dto.setR_path("path");
		
		
		reviewService.insertReview(dto);
		
		return "review/Reviewlist";
	}
	
	
}
