package com.yedam.java.ch0602;

public class MainExample {

	public static void main(String[] args) {

		Car car = new Car("검정", 1000); // 생성자와 형태가 동일해야만 new연산자를 호출가능

		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("김자바", "123454-1456567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

		System.out.println("----------------------------------------------");

		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		Car car2 = new Car("아반떼");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("쏘울, 베이지");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("티볼리", "블루", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
