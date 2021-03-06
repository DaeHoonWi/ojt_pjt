package com.edsk.movie.service;

import java.util.List;

import com.edsk.movie.dto.ReviewCommentDTO;
import com.edsk.movie.dto.ReviewDTO;
import com.edsk.movie.dto.ReviewLikeDTO;

public interface ReviewService {
	
	/*Review*/
	
	/**
	 * 모든 리뷰 리스트 조회
	 * @return : 리뷰 리스트 
	 * @throws Exception
	 */
	public List<ReviewDTO> selectReviewList() throws Exception;
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 조회
	 * @param rNum : 리뷰 번호 ( Review Table의 Primary key ) 
	 * @return : ReviewDTO
	 * @throws Exception
	 */
	public ReviewDTO selectReview(int rNum) throws Exception;
	
	/**
	 * 리뷰 입력
	 * @param dto : ReviewDTO
	 * @return 
	 * @throws Exception
	 */
	public int insertReview(ReviewDTO dto) throws Exception;
	
	/**
	 * 리뷰 수정 
	 * @param dto : ReviewDTO
	 * @throws Exception
	 */
	public int updateReview(ReviewDTO dto) throws Exception;
	
	/**
	 * 리뷰 조회수 증가(+1)
	 * @param rNum : 리뷰 번호
	 * @throws Exception
	 */
	public int updateReviewR_COUNT(int rNum) throws Exception;
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 추천수 증가(+1)
	 * (리뷰 추천 시  selectReviewLike, insertReviewLike, updateReviewR_Like 순서로 실행) 
	 * @param rNum : 리뷰 번호 
	 * @throws Exception
	 */
	public int updateReviewR_Like(int rNum) throws Exception;
	
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 삭제 
	 * @param rNum : 리뷰 번호
	 * @throws Exception
	 */
	public int deleteReview(int rNum) throws Exception;
	

	/*ReviewComment*/
	
	/**
	 * 리뷰 번호(rNum)에 해당하는 리뷰 댓글 리스트 조회
	 * @param rNum : 리뷰 번호
	 * @return :  리뷰 댓글 리스트
	 * @throws Exception
	 */
	public List<ReviewCommentDTO> selectReviewCommentList(int rNum) throws Exception;
	
	/**
	 * 리뷰 댓글 삽입
	 * @param dto : ReviewCommentDTO
	 * @throws Exception
	 */
	public int insertReviewComment(ReviewCommentDTO dto) throws Exception;
	
	/**
	 * 리뷰 댓글 수정
	 * @param dto : ReviewCommentDTO
	 * @return : 
	 * @throws Exception
	 */
	public int updateReviewComment(ReviewCommentDTO dto) throws Exception;
	
	/**
	 * 리뷰 댓글 삭제
	 * @param rcNum : 리뷰 번호
	 * @throws Exception
	 */
	public int deleteReviewComment(int rcNum) throws Exception;
	
	
	/*ReviewLike*/
	
	/**
	 * 리뷰 추천 여부 확인 (0 : 해당 리뷰에 대한 추천을 하지 않았음. 1: 해당 리뷰에 대해 이미 추천함)
	 * @param dto : ReviewLikeDTO
	 * @return : ReviewLike Table에 회원이 해당 리뷰를 추천했는지 조회 후 데이터의 수를 리턴.
	 * @throws Exception
	 */
	public int selectReviewLike(ReviewLikeDTO dto) throws Exception;
	
	/**
	 * 리뷰 추천시 관련 데이터(추천한 리뷰번호, 추천한 회원, 추천한 날짜) 삽입
	 * @param dto : ReviewLikeDTO
	 * @throws Exception
	 */
	public boolean insertReviewLike(ReviewLikeDTO dto) throws Exception;
	

}

