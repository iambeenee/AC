package com.yedam.java.example;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {

		// 문제 1 ) Calculator 클래스 -> 사칙연산에 대한 메서드

		Calculator myCal = new Calculator();

		int result1 = myCal.plus(6, 3);
		System.out.println("result1 : " + result1);

		int result2 = myCal.minus(6, 3);
		System.out.println("result2 : " + result2);

		double result3 = myCal.divide(10, 4);
		System.out.println("result3 : " + result3);

		int result4 = myCal.multi(3, 4);
		System.out.println("result4 : " + result4);
		
		//int x = 10;
		//int y = 4;
		//System.out.println("더하기 : " + myCal.plus(x, y));

		// 문제 2 ) TV 클래스 -> 다음과 같은 형태의 생성자와 메서드를 가진다.
		TV myTV = new TV("LG", 2017, 32);
		myTV.showInfo();
		TV myTV1 = new TV("SAMSUNG", 2021, 58);
		myTV1.showInfo();

		// 문제 3 ) Grade 클래스 -> 3과목의 점수를 입력받아 성적평균을 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade myGrade = new Grade(math, science, english);
		
		System.out.println("평균 : " + myGrade.average());

	}

}
