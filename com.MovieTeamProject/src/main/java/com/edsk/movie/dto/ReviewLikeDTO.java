package com.edsk.movie.dto;

import java.security.Timestamp;

/**
 * @author lg
 *
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
