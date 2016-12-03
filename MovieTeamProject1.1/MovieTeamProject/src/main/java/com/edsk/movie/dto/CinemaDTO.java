package com.edsk.movie.dto;

public class CinemaDTO {

	int c_num;
	int cou_num;
	String c_title;
	int c_runningtime;
	String c_summary;
	int c_count;
	String c_age;
	String c_original_file_name;
	String c_stored_file_name;
	
	public CinemaDTO() {		//디폴트 생성자
		// TODO Auto-generated constructor stub
	}
	
	public CinemaDTO(int c_num, int cou_num, String c_title, int c_runningtime, 
			String c_summary, int c_count, String c_age, String c_original_file_name, 
			String c_stored_file_name) {
		this.c_num = c_num;
		this.cou_num = cou_num;
		this.c_title = c_title;
		this.c_runningtime = c_runningtime;
		this.c_summary = c_summary;
		this.c_count = c_count;
		this.c_age =  c_age;
		this.c_original_file_name = c_original_file_name;
		this.c_stored_file_name = c_stored_file_name;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public int getCou_num() {
		return cou_num;
	}

	public void setCou_num(int cou_num) {
		this.cou_num = cou_num;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	public int getC_runningtime() {
		return c_runningtime;
	}

	public void setC_runningtime(int c_runningtime) {
		this.c_runningtime = c_runningtime;
	}

	public String getC_summary() {
		return c_summary;
	}

	public void setC_summary(String c_summary) {
		this.c_summary = c_summary;
	}

	public int getC_count() {
		return c_count;
	}

	public void setC_count(int c_count) {
		this.c_count = c_count;
	}

	public String getC_age() {
		return c_age;
	}

	public void setC_age(String c_age) {
		this.c_age = c_age;
	}

	public String getC_original_file_name() {
		return c_original_file_name;
	}

	public void setC_original_file_name(String c_original_file_name) {
		this.c_original_file_name = c_original_file_name;
	}

	public String getC_stored_file_name() {
		return c_stored_file_name;
	}

	public void setC_stored_file_name(String c_stored_file_name) {
		this.c_stored_file_name = c_stored_file_name;
	}
	
}
