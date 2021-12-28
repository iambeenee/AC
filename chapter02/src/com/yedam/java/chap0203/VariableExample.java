package com.yedam.java.chap0203;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 타입 변환 : 값의 유효범위 小 -> 大
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 :" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue :" + longValue);
		
		longValue = 100;
				float floatValue = longValue;
		System.out.println("floatValue :" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue :" + doubleValue);
		
		
		System.out.println();
		// 강제 타입 변환
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		System.out.println();
		// 정수 타입의 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
		//byte result1 = x + y;
		int result2 = x + y;
		System.out.println(result2);
		
		
		byte value1 = 10;
		byte value2 = 100;
		long value3 = 1000L;
		
		long result3 = value1 + value2 + value3;
		System.out.println(result3);
		
		// 실수 타입의 연산
		int intV1 = 10;
		double doubleV1 = 5.5;
		double resultValue = intV1 + doubleV1;
		System.out.println(resultValue);
		
		// 연산식에서 자동 타입변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int resultValue1 = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int resultValue2 = charValue1 + charValue2;
		System.out.println("유니코드 : " + resultValue2);
		System.out.println("출력문자 : " + (char)resultValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		
		double doubleValue1 = intValue3/4.0;
		System.out.println(doubleValue1);
		
		int x1 = 1;
		int y1 = 2;
		double result1 = x1/y1;
		System.out.println(result1);
		
		result1 = (double)x1 / y1;
		System.out.println(result1);
		
		System.out.println();
		// 문자열 결합
		int value = 10+2+8;
		System.out.println(value); //20
		
		String str1 = 10 + 2 + "8";
		System.out.println(str1); //128
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);; //1028
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3); //
		
		// String str4 = "10" + 2 + 8; = 1010
		String str4 = "10" + (2 + 8);
		//먼저 계산하고 싶은 부분 ()처리 -> 수학과 동일
		System.out.println(str4);
		
		// 기본 타입과 문자열 간의 변환
		int var1 = Integer.parseInt("10");
		double var2 = Double.parseDouble("3.14");
		boolean var3 = Boolean.parseBoolean("true");
				
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		
		
		String stringValue1 = String.valueOf(10);
		String stringValue2 = String.valueOf(3.14);
		String stringValue3 = String.valueOf(true);
		
		System.out.println("stringValue1 : " + stringValue1);
		System.out.println("stringValue2 : " + stringValue2);
		System.out.println("stringValue3 : " + stringValue3);
		
		
	}

}
