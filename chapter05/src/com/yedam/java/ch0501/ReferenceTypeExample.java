package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 비교
		String strVar1 = "장예빈";
		String strVar2 = "장예빈";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음.");
		} else {
			System.out.println("strVar1과 strVar2는 문자열이 다름.");
		}
		System.out.println();

		String strVar3 = new String("장예빈");
		String strVar4 = new String("장예빈");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름.");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음.");
		} else {
			System.out.println("strVar3과 strVar4는 문자열이 다름.");
		} // 스택에는 4개, 힙에는 3개

	}
}
