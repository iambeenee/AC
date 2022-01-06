package com.yedam.java.example;

public class Calculator {

	// 더하기
	int plus(int x, int y) {
		int result = 0;
		result = x + y;
		return result; //-> 간략히 return x+y;
	}

	// 뺄셈
	int minus(int x, int y) {
		int result = 0;
		result = x - y;
		return result;
	}

	// 나누기
		double divide(int x, int y) {
		double result = 0.0;
		result = x / y;
		return result;
	}

	// 곱하기
	int multi(int x, int y) {
		int result = 0;
		result = x * y;
		return result;
	}

}
