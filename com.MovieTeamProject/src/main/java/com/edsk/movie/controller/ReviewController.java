package com.edsk.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hsqldb.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edsk.movie.dto.ReviewDTO;
import com.edsk.movie.dto.ReviewLikeDTO;
import com.edsk.movie.service.ReviewService;

/**
 * @author lg
 *
 */
/**
 * @author lg
 *
 */
@Controller
public class ReviewController {

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping(value="reviewList.do")
	public String reviewList(Model model, HttpServletRequest request) throws Exception{
		
		logger.debug("================reviewList================"); 
				
		List<ReviewDTO> reviewDTO = reviewService.selectReviewList();

		model.addAttribute("reviewlist", reviewDTO);
		logger.debug(reviewDTO.get(0).toString());
		
		return "review/reviewList";
	}
	
	/**
	 * jfjjj kjgkh 
	 * @param model
	 * @param r_num
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="reviewDetail.do")
	public String reviewDetail(Model model, int rNum) throws Exception{
		
		logger.debug("================reviewDetail================");
		
		ReviewDTO reviewdto = reviewService.selectReview(rNum);
		
		model.addAttribute("rdto", reviewdto);
		
		return "review/reviewDetail";
	}
	
	@RequestMapping(value="writeReview.do")
	public String writeReview(Model model) throws Exception {
		
		logger.debug("================writeReview================"); 
		
		ReviewDTO reviewdto =  new ReviewDTO();
		reviewdto.setmId("kay");
		reviewdto.setrTitle("kay_title");
		reviewdto.setrContent("kay_content");
		reviewdto.setcNum(12);
		reviewdto.setrPath("path");
		
		reviewService.insertReview(reviewdto);

		/*(수정할점) 글쓰기 성공할 경우, alert으로 글 등록에 성공했습니다. 출력해야함*/  
		
		return "review/reviewList";
	}
	
	
	
	/**
	 * @param model
	 * @param r_num
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="reviewLike.do", method={RequestMethod.GET, RequestMethod.POST})
	public String reviewLike(Model model, int rNum, HttpServletRequest request) throws Exception{
		
		logger.debug("================reviewLike================");
		
		//session login 정보에서 m_id사용
		System.out.println(request.getSession().getId());
		
		ReviewLikeDTO reviewlikedto = new ReviewLikeDTO();
		reviewlikedto.setmId(request.getSession().getId());
		reviewlikedto.setrNum(rNum);
		
		// (수정할 점) 쿼리로 like 처리 단계를 줄일 수 없나 
/*		
 * 	(수정할점) 이부분 boolean bl = reviewService.selectReviewLike(dto) 이런식으로 변수로 받고 if조건문으로 쓰는 형식으로 변경하기  
 * if( reviewService.selectReviewLike(dto) == 0 ){	// 이전에 추천을 하지 않은 경우 
			if( reviewService.insertReviewLike(dto) ){
				reviewService.updateReviewR_Like(dto.getrNum());
			};
		}else {
			System.out.println("이미 추천을 했습니다."); // (수정할 점) 이 문구를 팝업창으로 띄워야함
		};
*/		
		return "review/reviewLike";	// (수정할 점) ajax로 사용할까 
	}
	
	
	
	
	
}
