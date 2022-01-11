package com.yedam.java.ch05.wrapper;

public class WrapperExample {
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100); // 권장하지 않음
		Integer obj2 = new Integer("200");

		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.parseInt("200");

		// Unboxing
		int value4 = obj4.intValue();

		System.out.println(value4);

		// 자동
		Integer obj = 100;

		int value = obj;

		//int result = obj.intValue() + 100; ->원래는 이렇게 씀
		int result = obj + 100;
		
		//포장객체 비교
		System.out.println("[-127~127를 초과한 경우]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("==결과 : " + (obj5 == obj6)); //각각의 인스턴스를 생성한 후 비교
		System.out.println("언박싱 후 결과 : " + (obj5.intValue()==obj6.intValue())); //들고있는 값을 비교
		System.out.println("equals() 결과 : " + obj5.equals(obj6));
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj7 = 100;
		Integer obj8 = 100;
		System.out.println("==결과 : " + (obj7 == obj8)); 
		System.out.println("언박싱 후 결과 : " + (obj7.intValue()==obj8.intValue())); //들고있는 값을 비교
		System.out.println("equals() 결과 : " + obj7.equals(obj8));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
