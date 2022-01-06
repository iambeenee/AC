package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 이용하여 배열 생성1
		int[] scores = { 83, 90, 87 };

		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		System.out.println("--------");
		for (int i = 0; i < 3; i++) { // 변수는 0으로 초기화, 배열의 크기와 같을순 없다.
			System.out.println(scores[i]);
		}

		System.out.println("--------");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평군 : " + avg);

		System.out.println("--------");

		// 값을 이용하여 배열 생성2
		int[] scores1;
		scores1 = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores1[i];
		}
		System.out.println("총합 : " + sum1);

		System.out.println("--------");
		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);

		System.out.println("--------");
		
		// new 연산자로 배열생성
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		System.out.println("--------");
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		System.out.println("----String 타입----");
		// String 타입
		String[] arr2 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		System.out.println("--------");
		arr2[0] = "1월";
		arr2[1] = "2월";
		arr2[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		System.out.println("--------");
		// 배열의 length -> 배열의 크기
		int[] scores3 = {58, 65,87};
		
		int sum3 = 0;
		for (int i=0; i<scores3.length; i++) {
			sum3 += scores3[i];
		}
		System.out.println("총합 : " + sum3);
		double avg3 = (double)sum3 / scores3.length;
		System.out.println("평균 : " + avg3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
