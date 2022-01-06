package com.yedam.java.example2;

public class StudentExample {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.setStudentName("이지원");
		System.out.println(Student.getSerialNum());
		System.out.println(studentLee.getStudentName() + "의 학번 : " + studentLee.getStudentId());
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(Student.getSerialNum());
		System.out.println(studentSon.getStudentName() + "의 학번 : " + studentSon.getStudentId());
		
		
		
		
		
		
		
		

	}

}
