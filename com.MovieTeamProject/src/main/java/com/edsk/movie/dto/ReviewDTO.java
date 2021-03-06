package com.edsk.movie.dto;

import java.sql.Timestamp;

/**
 * @author 권아영
 * 리뷰에 대한 DTO
 */
public class ReviewDTO {

	/**
	 * rNum : 리뷰 번호
	 * cNum : 리뷰 영화
	 * mId : 리뷰 작성자
	 * rTitle : 리뷰 제목
	 * rContent : 리뷰 내용
	 * rDate : 리뷰 작성일
	 * rCount : 리뷰 조회수
	 * rLike : 리뷰 추천수
	 * rPath : 리뷰 첨부파일 경로
	 */
	private int rNum;
	private int cNum;		//cNum 이런식으로 고치기
	private String mId;
	private String rTitle;
	private String rContent;
	private Timestamp rDate;
	private int rCount;
	private int rLike;
	private String rPath;
	
	/**
	 * 기본 생성자
	 */
	public ReviewDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ReviewDTO 모든 변수를 파라미터로 갖는 생성자
	 * @param rNum : 리뷰 번호
	 * @param cNum : 리뷰 영화
	 * @param mId : 리뷰 작성자
	 * @param rTitle : 리뷰 제목
	 * @param rContent : 리뷰 내용
	 * @param rDate : 리뷰 작성일
	 * @param rCount : 리뷰 조회수
	 * @param rLike : 리뷰 추천수
	 * @param rPath : 리뷰 첨부파일 경로
	 */
	public ReviewDTO(
			int rNum, int cNum, String mId, String rTitle, String rContent
			, Timestamp rDate, int rCount, int rLike, String rPath ) {
		this.rNum = rNum;
		this.cNum = cNum;
		this.rTitle = rTitle;
		this.rContent = rContent;
		this.rDate = rDate;
		this.rCount = rCount;
		this.rLike = rLike;
		this.rPath = rPath;
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
	 * @return the cNum
	 */
	public int getcNum() {
		return cNum;
	}

	/**
	 * @param cNum the cNum to set
	 */
	public void setcNum(int cNum) {
		this.cNum = cNum;
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
	 * @return the rTitle
	 */
	public String getrTitle() {
		return rTitle;
	}

	/**
	 * @param rTitle the rTitle to set
	 */
	public void setrTitle(String rTitle) {
		this.rTitle = rTitle;
	}

	/**
	 * @return the rContent
	 */
	public String getrContent() {
		return rContent;
	}

	/**
	 * @param rContent the rContent to set
	 */
	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	/**
	 * @return the rDate
	 */
	public Timestamp getrDate() {
		return rDate;
	}

	/**
	 * @param rDate the rDate to set
	 */
	public void setrDate(Timestamp rDate) {
		this.rDate = rDate;
	}

	/**
	 * @return the rCount
	 */
	public int getrCount() {
		return rCount;
	}

	/**
	 * @param rCount the rCount to set
	 */
	public void setrCount(int rCount) {
		this.rCount = rCount;
	}

	/**
	 * @return the rLike
	 */
	public int getrLike() {
		return rLike;
	}

	/**
	 * @param rLike the rLike to set
	 */
	public void setrLike(int rLike) {
		this.rLike = rLike;
	}

	/**
	 * @return the rPath
	 */
	public String getrPath() {
		return rPath;
	}

	/**
	 * @param rPath the rPath to set
	 */
	public void setrPath(String rPath) {
		this.rPath = rPath;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReviewDTO [rNum=" + rNum + ", cNum=" + cNum + ", mId=" + mId
				+ ", rTitle=" + rTitle + ", rContent=" + rContent + ", rDate="
				+ rDate + ", rCount=" + rCount + ", rLike=" + rLike
				+ ", rPath=" + rPath + "]";
	}
	
}
