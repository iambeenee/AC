package com.yedam.java.ch01_01;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//new People(name, ssn);
		this.studentNo = studentNo;
	}

	
	
	
	
	
}
