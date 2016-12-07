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
 *	영화정보 관련 컨트롤러
 */
@Controller
public class CinemaController {

	private static final Logger logger = LoggerFactory.getLogger(CinemaController.class);
	
	@Autowired
	private CinemaService cinemaService = null;
	
	
	/**
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * 영화 리스트 컨트롤러
	 * DB에 있는 모든 영화들과 영화들의 정보를 불러온다.
	 */
	@RequestMapping(value = "cinemaList.do")
	public String cinemaList(Model model) throws Exception {
		
		logger.debug("================cinemaList================");
		
		List<CinemaDTO> cinemaDTO = cinemaService.selectCinemaList();
		model.addAttribute("cinemaList", cinemaDTO);
		return "cinemaInfo/cinemaList";
	}

	
	/**
	 * @param model
	 * @return
	 * 
	 * 영화추가 화면 컨트롤러
	 * 영화추가 View로 넘기는 역할
	 */
	@RequestMapping(value = "cinemaWriteVeiw.do")
	public String cinemaWriteVeiw(Model model) {
		logger.debug("================cinemaWriteVeiw================");
		return "cinemaInfo/cinemaWriteVeiw";
	}

	
	/**
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * 영화추가 DB입력 컨트롤러
	 * View에서 작성된 정보를 post 방식으로 request에 받아오고, 받아온 정보를 서비스객체를 통해 DB에 입력 
	 */
	@RequestMapping(value = "cinemaWrite.do")
	public String cinemaWrite(HttpServletRequest request, Model model) throws Exception {
		logger.debug("================cinemaWrite================");
		cinemaService.writeCinema(request);
		return "redirect:cinemaInfo/cinemaList";
	}

	
}
