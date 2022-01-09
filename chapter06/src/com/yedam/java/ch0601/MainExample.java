package com.yedam.java.ch0601;

public class MainExample {

	public static void main(String[] args) {
		Car car1 = new Car(); // 객체(인스턴스) 생성
		System.out.println("car1 변수가 Car인스턴스를 참조합니다.");

		Car car2 = new Car();
		System.out.println("car2 변수가 또 다른 Car인스턴스를 참조합니다.");
		
		//
		System.out.println("----------------------------------------");
		Car myCar = new Car();
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60; //반드시 인스턴스이름을 설정해줘야함
		System.out.println("수정된 속도 : " + myCar.speed);
	}

}
