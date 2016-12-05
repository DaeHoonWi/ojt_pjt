package com.edsk.movie.dto;

public class ActorDTO {

	int ac_num;
	int ac_code;
	int c_num;
	String a_character;
	String a_part;
	
	public ActorDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ActorDTO(int ac_num, int ac_code, int c_num, String a_character, 
			String a_part) {
		this.ac_num = ac_num;
		this.ac_code = ac_code;
		this.c_num = c_num;
		this.a_character = a_character;
		this.a_part = a_part;
	}

	public int getAc_num() {
		return ac_num;
	}

	public void setAc_num(int ac_num) {
		this.ac_num = ac_num;
	}

	public int getAc_code() {
		return ac_code;
	}

	public void setAc_code(int ac_code) {
		this.ac_code = ac_code;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public String getA_character() {
		return a_character;
	}

	public void setA_character(String a_character) {
		this.a_character = a_character;
	}

	public String getA_part() {
		return a_part;
	}

	public void setA_part(String a_part) {
		this.a_part = a_part;
	}
	
}
