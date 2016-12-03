package com.edsk.movie.dto;

public class DirectorDTO {

	int d_num;
	int dc_code;
	int c_num;
	
	public DirectorDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public DirectorDTO(int d_num, int dc_code, int c_num) {
		this.d_num = d_num;
		this.dc_code = dc_code;
		this.c_num = c_num;
	}

	public int getD_num() {
		return d_num;
	}

	public void setD_num(int d_num) {
		this.d_num = d_num;
	}

	public int getDc_code() {
		return dc_code;
	}

	public void setDc_code(int dc_code) {
		this.dc_code = dc_code;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	
	
}
