package com.edsk.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CinemaController {
	
	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	
	@RequestMapping(value="CinemaList.do")
	public String main(Model model) throws Exception{

		return "cinemainfo/cinnemaList";
	}
}
