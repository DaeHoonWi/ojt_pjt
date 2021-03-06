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

/************************************************
* <pre>
* 영화정보 관련 컨트롤러
* </pre>
* @Company : (주)한국이디에스
* @Author  : 위대훈
* @Date    : 2016. 12. 7. 오후 8:25:41
* @Version : 1.0
* @MovieTeamProject 게시판
*************************************************/
@Controller
public class CinemaController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(CinemaController.class);

	@Autowired
	private CinemaService cinemaService = null;

	/**
	  * <pre>
	  * 영화 리스트 컨트롤러 DB에 있는 모든 영화들과 영화들의 정보를 불러온다.
	  * </pre>
	  * @param model
	  * @return
	  * @throws Exception
	*/
	@RequestMapping(value = "cinemaList.do")
	public String cinemaList(Model model) throws Exception {

		logger.debug("================cinemaList================");

		List<CinemaDTO> cinemaDTO = cinemaService.selectCinemaList();
		model.addAttribute("cinemaList", cinemaDTO);
		return "cinemaInfo/cinemaList";
	}

	/**
	  * <pre>
	  * 영화추가 화면 컨트롤러
	  * 영화추가 View로 넘기는 역할
	  * </pre>
	  * @param model
	  * @return
	*/
	@RequestMapping(value = "cinemaWriteVeiw.do")
	public String cinemaWriteVeiw(Model model) {
		logger.debug("================cinemaWriteVeiw================");
		return "cinemaInfo/cinemaWriteVeiw";
	}

	/**
	  * <pre>
	  *	영화추가 DB입력 컨트롤러
	  * View에서 작성된 정보를 post 방식으로 request에 받아오고,
	  * 받아온 정보를 서비스객체를 통해 DB에 입력
	  * </pre>
	  * @param request
	  * @param model
	  * @return
	  * @throws Exception
	*/
	@RequestMapping(value = "cinemaWrite.do")
	public String cinemaWrite(HttpServletRequest request, Model model)
			throws Exception {
		logger.debug("================cinemaWrite================");
		cinemaService.writeCinema(request);
		return "redirect:cinemaList.do";
	}
	
	/**
	  * <pre>
	  * 영화 상세보기 컨트롤러
	  * 하나의 영화 정보를 상세보기 하는 페이지로 넘기고,
	  * 상세 Data를 뿌려주는 컨트롤러
	  * </pre>
	  * @param cNum
	  * @param model
	  * @return
	  * @throws Exception
	*/
	@RequestMapping(value = "cinemaDetailView.do")
	public String cinemaDetailView(int cNum, Model model) throws Exception {
		logger.debug("================cinemaDetailView================");
		
		CinemaDTO cinemaDTO = cinemaService.selectCinemaDetail(cNum);
		model.addAttribute("cinemaDetail", cinemaDTO);
		return "cinemaInfo/cinemaDetailView";
	}
	
	/**
	  * <pre>
	  * 영화 정보 삭제 컨트롤러
	  * cNum에 해당하는 영화 Data 삭제
	  * </pre>
	  * @param request
	  * @param model
	  * @return
	  * @throws Exception
	*/
	@RequestMapping(value = "cinemaDelete.do")
	public String cinemaDelete(int cNum, Model model) throws Exception {
		logger.debug("================cinemaDelete================");
		cinemaService.deleteCinema(cNum);
		return "redirect:cinemaList.do";
	}

	/**
	  * <pre>
	  * 영화정보 update하는 폼으로 넘겨줌
	  * 폼은 기본적으로 기존에 갖고있는 데이터를 보여준다.
	  * 기존의 데이터를 불러오는 방법은 selectCinemaDitail() 서비스 메소드를 이용한다.
	  * 수정 할 값을 입력 할 수 있다.
	  * </pre>
	  * @param cNum
	  * @param model
	  * @return
	  * @throws Exception
	*/
	@RequestMapping(value = "cinemaUpdateFormView.do")
	public String cinemaUpdateFormView(int cNum, Model model) throws Exception {
		logger.debug("================cinemaUpdateForm================");
		CinemaDTO cinemaDTO = cinemaService.selectCinemaDetail(cNum);
		model.addAttribute("cinemaDetail", cinemaDTO);
		return "cinemaInfo/cinemaUpdateFormView";
	}
	
	@RequestMapping(value = "cinemaUpdate.do")
	public String cinemaUpdate(HttpServletRequest request, Model model, int cNum) throws Exception {
		logger.debug("================cinemaUpdate================");
		cinemaService.updateCinema(request);
		
		return "redirect:cinemaDetailView.do?cNum="+cNum;
	}
}
