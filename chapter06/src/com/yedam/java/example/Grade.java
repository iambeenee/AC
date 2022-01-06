package com.yedam.java.example;

public class Grade {

	// 필드
	int math;
	int science;
	int english;

	// 생성자
	Grade(int math, int science, int english) { // 생성자 골격 만든 후 역으로 필드 만들기
		this.math = math;
		this.science = science;
		this.english = english;
	}

	// 메소드
	double average() {
		double avg = 0;
		int sum = math + science + english;
		avg = sum / 3.0;
		return avg;
	}

}
