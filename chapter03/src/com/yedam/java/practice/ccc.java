package com.yedam.java.practice;

import java.util.Scanner;

public class ccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
//3
		/*
		boolean stop = …;
		while() {
			
		}
		*/

//5
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2; //2.0
		int var4 = (int) var3 * var2;
		System.out.println(var4);	
		
//6
	int value = 356;
		//System.out.println()
		
//7
		float fVar1 = 10f;
		float fVar2 = fVar1 / 100;
			//System.out.println(fVar2); //0.1
		if(fVar2 == 0.1f) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		
//8
		int lengthTop = 5;
		int lengthBottom = 10;
		int heigth = 7;
		double area = ((lengthTop + lengthBottom) * heigth) /2.0;
			System.out.println(area);
		
//9
		/*
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("첫 번째 수 : ");
			String str1 = scanner.nextLine();
			
			System.out.println("두 번째 수 : ");
			String str2 = scanner.nextLine();
			
			double result = Double.parseDouble(str1 / str2);
			
			System.out.println("결과 : " + result);
			*/
			
//10
			/*
			int var5 = 10;
			int var6 = 3;
			int var7 = 14;
			double var8 =  var5 * var5 * var6 + "." + var7;
			System.out.println("원의 넓이 : " + var8);
			*/
			
//11
		/*
			Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디");
		String name = scanner.nextLine();
		
		System.out.println("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if((name == "java") && (strPassword == "12345")) {
			if(strPassword == "12345") {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		*/
		
			
//12
			int x =10;
			int y = 5;
			System.out.println( (x>7) && (y<=5) );
			System.out.println( (x%3 == 2) || (y%2 != 1) );
			
			
			
//14
			int score = 85;
			String sResult = (!(score>90)) ? "가" : "나";
			System.out.println(sResult);
			
		
			
			
			
			//문제1) 아래와 같이 각 변수를 초기화하였을 때 각 문제에 맞게 구현하세요.
			int x = 10;
			int y = 10;
			int result;
			
			//1-1) 부호연산자를 이용하여 변수 x의 값을 음수로 출력하세요. 단, 변수 x의 값은 변하지 말아야 한다.
			
			//1-2) 변수 x와 y의 값을 더한 후 y의 값을 증가시키는 연산식을 한줄로 작성하여라.
			result = x + y++;
			//1-3) 변수 x와 y의 값을 더한 값이 20이 되도록 변수 x와 y 중 하나의 변수에 증감연산자를 사용하여 연산식을 한줄로 작성하여라.
			result = --x + y;
			result = x + --y;
			//1-4) 변수 x에서 변수 y를 나눈 후 몫과 나머지를 출력하여라.
98
			
	}

}
