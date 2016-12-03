package com.edsk.movie.dto;

public class GenreDTO {

	int g_num;
	int gc_code;
	int c_num;
	
	public GenreDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public GenreDTO(int g_num, int gc_code, int c_num) {
		this.g_num = g_num;
		this.gc_code = gc_code;
		this.c_num = c_num;
	}

	public int getG_num() {
		return g_num;
	}

	public void setG_num(int g_num) {
		this.g_num = g_num;
	}

	public int getGc_code() {
		return gc_code;
	}

	public void setGc_code(int gc_code) {
		this.gc_code = gc_code;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	
	
}
