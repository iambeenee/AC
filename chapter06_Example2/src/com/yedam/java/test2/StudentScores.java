package com.yedam.java.test2;

public class StudentScores {

	// 필드
	private String name;
	private int grade;
	private int korean;
	private int english;
	private int math;

	// 생성자
	StudentScores(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	// 메소드

	public int getKorean() {
		return korean;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return korean + english + math;
	}

	public double getAverage() {
		return getTotal() / 3.0;
	}

}
