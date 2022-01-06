package com.yedam.java.package1;

//class A {	//default 접근 제한자 -> 같은 package내에서만 사용가능
public class A {

	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	// 생성자
	public A(boolean b) {
	}

	A(int b) {
	}

	private A(String b) {
	} // ->자기 내부에서만 사용 가능

	//
	// 필드
	public int field1;
	int field2;
	private int field3;

	// 생성자
	public A() {

		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
	}

	// 메소드
	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}
}
