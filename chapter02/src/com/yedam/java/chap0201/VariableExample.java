package com.yedam.java.ch0201;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언 -> 타입 변수이름
		int age;
		double value;
		
		//변수 초기화 -> 실질적인 메모리 할당이 이루어짐
		age = 20;
		
		//int result = age + (int)value;
		
		//변수사용
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		//변수 복사
		int x = 3;
		int y = 5;
		System.out.println("x:"+ x +", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		//변수의 사용범위
		int v1 = 15;
		if(v1 > v10) {
			int v2;
			v2 = v1 - 10;
		  }
		int v3 = v1 + v2 =5;
	}

}
