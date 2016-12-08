package com.edsk.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edsk.movie.dto.ReviewCommentDTO;
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
	
	/* Review */
	
	/**
	 * 리뷰 리스트 출력
	 * @param model
	 * @param request : session 관련
	 * @return : 리뷰 게시판(리뷰 리스트 조회 페이지)으로 이동
	 * @throws Exception
	 */
	@RequestMapping(value="reviewList.do")
	public String reviewList(Model model, HttpServletRequest request) throws Exception{
		
		logger.debug("================reviewList================"); 
				
		List<ReviewDTO> reviewDTO = reviewService.selectReviewList();

		model.addAttribute("reviewlist", reviewDTO);
		logger.debug(reviewDTO.get(0).toString());
		
		return "review/reviewList";
	}
	

	/**
	 * 리뷰 상세 조회
	 * @param model
	 * @param rNum : 리뷰 번호
	 * @return : 리뷰 상세 조회 페이지로 이동
	 * @throws Exception
	 */
	@RequestMapping(value="reviewDetail.do")
	public String reviewDetail(Model model, int rNum) throws Exception{
		
		logger.debug("================reviewDetail================");
		
		ReviewDTO reviewdDTO = reviewService.selectReview(rNum);
		List<ReviewCommentDTO> reviewCommentDTO = reviewService.selectReviewCommentList(rNum);

		model.addAttribute("reviewdto", reviewdDTO);
		model.addAttribute("reviewcommentlist", reviewCommentDTO);
		
		return "review/reviewDetail";
	}
	
	/**
	 * 리뷰 입력 
	 * @param model
	 * @return : 리뷰 입력 후 리뷰 게시판(리뷰 리스트 조회 페이지)으로 이동
	 * @throws Exception
	 */
	@RequestMapping(value="writeReview.do")
	public String writeReview(Model model) throws Exception {
		
		logger.debug("================writeReview================"); 
		
		ReviewDTO reviewdto =  new ReviewDTO();
		// (수정할 점 ) 임의로 값 넣음
		reviewdto.setmId("kay");
		reviewdto.setrTitle("kay_title");
		reviewdto.setrContent("kay_content");
		reviewdto.setcNum(12);
		reviewdto.setrPath("path");
		
		reviewService.insertReview(reviewdto);

		/*(수정할점) 글쓰기 성공할 경우, alert으로 글 등록에 성공했습니다. 출력해야함 */  
		
		return "review/reviewList";
	}
	
	
	
	/**
	 * (코드 작성 중)
	 * 리뷰 추천 
	 * @param model
	 * @param rNum : 리뷰 번호
	 * @param request : session 관련
	 * @return : 
	 * @throws Exception
	 */
	@RequestMapping(value="reviewLike.do")
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
		 *		if( reviewService.insertReviewLike(dto) ){
		 *			reviewService.updateReviewR_Like(dto.getrNum());
		 *			};
		 *		}else {
		 *			System.out.println("이미 추천을 했습니다."); // (수정할 점) 이 문구를 팝업창으로 띄워야함
		 *		};
		 */		
		return "review/reviewLike";	// (수정할 점) ajax로 사용할까 
	}
	
	
	/* ReviewComment */
	
	@RequestMapping(value="writeReviewComment.do")
	public String writeReviewComment(Model model, HttpServletRequest request
			, ReviewCommentDTO dto) throws Exception{
		
		logger.debug("================writeReviewComment================");
		logger.debug(dto.toString());
		
		int insertResult = 0;
		insertResult = reviewService.insertReviewComment(dto);
		logger.debug("insertResult"+insertResult);
		
		//(수정할점) reviewDetail.do기능과 동일. 합칠 수 없나
		ReviewDTO reviewdDTO = reviewService.selectReview(dto.getrNum());
		List<ReviewCommentDTO> reviewCommentDTO = reviewService.selectReviewCommentList(dto.getrNum());

		model.addAttribute("reviewdto", reviewdDTO);
		model.addAttribute("reviewcommentlist", reviewCommentDTO);
		
		return "review/reviewDetail";
	}
	
	/**
	 * 리뷰 댓글 수정
	 * @param model
	 * @param rcNum : 리뷰 댓글 번호
	 * @param rcContent : 리뷰 댓글 내용
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="updateReviewComment.do")
	@ResponseBody
	public String updateReviewComment(Model model, int rcNum, String rcContent) throws Exception{
		
		logger.debug("================updateReviewComment================");
		
		ReviewCommentDTO reviewCommentDTO = new ReviewCommentDTO();
		reviewCommentDTO.setRcNum(rcNum);
		reviewCommentDTO.setRcContent(rcContent);

		logger.debug(reviewCommentDTO.toString());
		
		int updatecount = 0;
		updatecount = reviewService.updateReviewComment(reviewCommentDTO);
		System.out.println(updatecount);
		
	/*	if(updatecount > 0)
			return "수정되었습니다";
		else
			return "수정에 실패했습니다";	*/// (수정할점 : 오류) updatecount > 0 임에도 실패

		return rcContent;
	}
	
}
