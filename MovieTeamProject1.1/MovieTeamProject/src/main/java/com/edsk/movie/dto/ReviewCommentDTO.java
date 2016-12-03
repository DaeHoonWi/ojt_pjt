package com.edsk.movie.dto;

import java.security.Timestamp;

public class ReviewCommentDTO {

	private int rc_num;
	private int r_num;
	private String m_id;
	private String rc_content;
	private Timestamp rc_date;
	
	public ReviewCommentDTO() {
	
	}

	public int getRc_num() {
		return rc_num;
	}

	public void setRc_num(int rc_num) {
		this.rc_num = rc_num;
	}

	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getRc_content() {
		return rc_content;
	}

	public void setRc_content(String rc_content) {
		this.rc_content = rc_content;
	}

	public Timestamp getRc_date() {
		return rc_date;
	}

	public void setRc_date(Timestamp rc_date) {
		this.rc_date = rc_date;
	}

	@Override
	public String toString() {
		return "ReviewComment [rc_num=" + rc_num + ", r_num=" + r_num
				+ ", m_id=" + m_id + ", rc_content=" + rc_content
				+ ", rc_date=" + rc_date + "]";
	}
	
	
}
