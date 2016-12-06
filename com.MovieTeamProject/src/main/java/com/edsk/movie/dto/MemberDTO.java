package com.edsk.movie.dto;

import java.util.Date;

public class MemberDTO {

	private String m_id;
	private String m_password;
	private Date m_birthday;
	private int m_authority;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public Date getM_birthday() {
		return m_birthday;
	}

	public void setM_birthday(Date m_birthday) {
		this.m_birthday = m_birthday;
	}

	public int getM_authority() {
		return m_authority;
	}

	public void setM_authority(int m_authority) {
		this.m_authority = m_authority;
	}

	@Override
	public String toString() {
		return "MemberDTO [m_id=" + m_id + ", m_password=" + m_password
				+ ", m_birthday=" + m_birthday + ", m_authority=" + m_authority
				+ "]";
	}
	
	

}
