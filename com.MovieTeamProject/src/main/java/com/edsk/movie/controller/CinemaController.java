package com.edsk.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edsk.movie.dto.CinemaDTO;
import com.edsk.movie.service.CinemaService;


/**
 * @author DaeHoon Wi
 *
 */
@Controller
public class CinemaController {

	private static final Logger logger = LoggerFactory.getLogger(CinemaController.class);
	
	@Autowired
	private CinemaService cinemaService;
	
	@RequestMapping(value = "cinemaList.do")
	public String cinemaList(Model model) throws Exception {

		logger.debug("================cinemaList================");

		List<CinemaDTO> cinemaDTO = cinemaService.selectCinemaList();
		
		model.addAttribute("cinemaList", cinemaDTO);
		
		return "cinemaInfo/cinemaList";
	}

	@RequestMapping(value = "cinemaWriteVeiw.do")
	public String cinemaWriteVeiw(Model model) {

		logger.debug("================cinemaWriteVeiw================");
		
		return "cinemaInfo/cinemaWriteVeiw";
	}

	@RequestMapping(value = "cinemaWrite.do")
	public String cinemaWrite(HttpServletRequest cinemaWriteRequest, Model model) {

		logger.debug("================cinemaWrite================");

		model.addAttribute("request", cinemaWriteRequest);

		return "redirect:cinemaInfo/cinemaList";
	}

}
