package com.edsk.movie.dto;

public class Actor_categoryDTO {

	int ac_code;
	String ac_name;
	
	public Actor_categoryDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Actor_categoryDTO(int ac_code, String ac_name) {
		this.ac_code = ac_code;
		this.ac_name = ac_name;
	}

	public int getAc_code() {
		return ac_code;
	}

	public void setAc_code(int ac_code) {
		this.ac_code = ac_code;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	
	
}
