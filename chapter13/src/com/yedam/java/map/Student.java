package com.yedam.java.map;

public class Student {

	// 필드
	public int sno; // 학과
	public String name; // 이름

	// 생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 메소드
	@Override
	public int hashCode() { // 동일한 객체인지를 확인
		return name.hashCode() + sno;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			
			boolean isSno = (sno == student.sno);
			boolean isName = (name == student.name);
			
			return isSno && isName;
		} else {
			return false;
		}
	}

}
