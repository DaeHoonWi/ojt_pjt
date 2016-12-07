package com.edsk.movie.dto;

public class CinemaDTO {

	int cNum;		//영화 번호
	int couNum;		//나라 번호
	String cTitle;		//영화 제목
	int cRunningtime;		//러닝타임
	String cSummary;		//줄거리
	
	int cCount;		//리뷰 수
	String cAge;		//시청연령제한
	String cOriginalFileName;		//원본 파일명
	String cStoredFileName;		//저장 파일명
	int cPlaydate;		//개봉일
	
	public CinemaDTO() {		//디폴트 생성자
		// TODO Auto-generated constructor stub
	}
	
	public CinemaDTO(int cNum, int couNum, String cTitle, int cRunningtime
			, String cSummary, int cCount, String cAge, String cOriginalFileName
			, String cStoredFileName, int cPlaydate) {
		this.cNum = cNum;
		this.couNum = couNum;
		this.cTitle = cTitle;
		this.cRunningtime = cRunningtime;
		this.cSummary = cSummary;
		this.cCount = cCount;
		this.cAge =  cAge;
		this.cOriginalFileName = cOriginalFileName;
		this.cStoredFileName = cStoredFileName;
		this.cPlaydate = cPlaydate;
	}

	public int getcNum() {
		return cNum;
	}

	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	public int getcouNum() {
		return couNum;
	}

	public void setcouNum(int couNum) {
		this.couNum = couNum;
	}

	public String getcTitle() {
		return cTitle;
	}

	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}

	public int getcRunningtime() {
		return cRunningtime;
	}

	public void setcRunningtime(int cRunningtime) {
		this.cRunningtime = cRunningtime;
	}

	public String getcSummary() {
		return cSummary;
	}

	public void setcSummary(String cSummary) {
		this.cSummary = cSummary;
	}

	public int getcCount() {
		return cCount;
	}

	public void setcCount(int cCount) {
		this.cCount = cCount;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	public String getcOriginalFileName() {
		return cOriginalFileName;
	}

	public void setcOriginalFileName(String cOriginalFileName) {
		this.cOriginalFileName = cOriginalFileName;
	}

	public String getcStoredFileName() {
		return cStoredFileName;
	}

	public void setcStoredFileName(String cStoredFileName) {
		this.cStoredFileName = cStoredFileName;
	}

	public int getcPlaydate() {
		return cPlaydate;
	}

	public void setcPlaydate(int cPlaydate) {
		this.cPlaydate = cPlaydate;
	}
	
	
}
