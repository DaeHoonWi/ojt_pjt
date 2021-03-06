package com.edsk.movie.dto;

import java.util.Date;

/**
 * @author 권아영
 * 회원에 대한 DTO
 */
public class MemberDTO {

	/**
	 * mId : 회원 아이디
	 * mPassword : 회원 비밀번호
	 * mBirthday : 회원 생년월일
	 * mAuthority : 회원 권한 ( 1: 관리자 , 2: 회원) 
	 */
	private String mId;
	private String mPassword;
	private Date mBirthday;
	private int mAuthority;
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
	 * @return the mPassword
	 */
	public String getmPassword() {
		return mPassword;
	}
	/**
	 * @param mPassword the mPassword to set
	 */
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	/**
	 * @return the mBirthday
	 */
	public Date getmBirthday() {
		return mBirthday;
	}
	/**
	 * @param mBirthday the mBirthday to set
	 */
	public void setmBirthday(Date mBirthday) {
		this.mBirthday = mBirthday;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberDTO [mId=" + mId + ", mPassword=" + mPassword
				+ ", mBirthday=" + mBirthday + ", mAuthority=" + mAuthority
				+ "]";
	}
	/**
	 * @return the mAuthority
	 */
	public int getmAuthority() {
		return mAuthority;
	}
	/**
	 * @param mAuthority the mAuthority to set
	 */
	public void setmAuthority(int mAuthority) {
		this.mAuthority = mAuthority;
	}
	


}
