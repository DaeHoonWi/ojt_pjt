package com.edsk.movie.dto;

import java.sql.Timestamp;

/**
 * @author 권아영
 * 리뷰 추천에 관한 DTO
 */
public class ReviewLikeDTO {

	/** 
	 * rNum : 추천한 리뷰 번호 
	 * mId : 추천한 회원
	 * rlDate : 추천한 날짜
	 * 
	 */
	private int rNum;
	private String mId;
	private Timestamp rlDate;
	
	/**
	 * 기본 생성자
	 */
	public ReviewLikeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ReviewLikeDTO 모든 변수를 파라미터로 갖는 생성자
	 * @param rNum : 추천한 리뷰 번호 
	 * @param mId : 추천한 회원
	 * @param rlDate : 추천한 날짜
	 */
	public ReviewLikeDTO(int rNum, String mId, Timestamp rlDate) {
		this.rNum = rNum;
		this.mId = mId;
		this.rlDate = rlDate;
	}
	
	
	/**
	 * @return the rNum
	 */
	public int getrNum() {
		return rNum;
	}

	/**
	 * @param rNum the rNum to set
	 */
	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	/**
	 * @return the mId
	 */
	public String getmId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setmId(String mId) {
		this.mId = mId;
	}

	/**
	 * @return the rlDate
	 */
	public Timestamp getRlDate() {
		return rlDate;
	}

	/**
	 * @param rlDate the rlDate to set
	 */
	public void setRlDate(Timestamp rlDate) {
		this.rlDate = rlDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReviewLikeDTO [rNum=" + rNum + ", mId=" + mId + ", rlDate="
				+ rlDate + "]";
	}

	
	
}
