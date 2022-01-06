package com.yedam.java.example;

public class TV {
	
	//필드
	String company;
	int year;
	int inch;
	
	//생성자
	TV(String company, int year, int inch){		//->골격만들기
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	//메서드 ->호출
	void showInfo() {
		System.out.println(company+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	

}
