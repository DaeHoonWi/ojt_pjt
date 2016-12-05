package com.edsk.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CinemaController {

	@RequestMapping(value="CinemaList.do")
	public String main(Model model) throws Exception{
		
		System.out.println("cinemaList()");
		
	
		
		return "cinemaInfo/cinemaList";
	}
}
