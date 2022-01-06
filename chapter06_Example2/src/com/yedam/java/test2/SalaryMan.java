package com.yedam.java.test2;

public class SalaryMan {

	// 필드
	private int salary;

	// 생성자
	public SalaryMan() { // -> 기본 생성자에서 필드 salary의 초기값을 사용
		salary = 1000000;
	}

	SalaryMan(int salary) { // ->정수형 매개변수를 가지는 생성자에서 해당 매개변수를 월 급여액으로 저장
		this.salary = salary;
	}

	// 메소드

	int getAnnualGross() {
		int salarys = 0;
		salarys = (salary * 12) + (salary * 5);

		return salarys;
	}

}
