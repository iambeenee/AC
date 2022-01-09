package com.yedam.java.ch0502;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
		// 3) 각 가격에 해당하는 제품명은 인덱스+1로 합니다.
		// 예를 들어 배열[0] = 10000 이면 10,000원인 제품은 1번째 제품입니다.
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		int product = 0;
		int sale[] = null;

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.상품수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("메뉴선택>");

			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				
				System.out.println("상품수>");
				product = scanner.nextInt();
				sale = new int[product];
				break;
			case 2:
				System.out.println("가격입력>");
				for (int i = 0; i < sale.length; i++) {
					System.out.println("Sale[" + i +1+ "]=");
					int sale1 = scanner.nextInt();
					sale[i] = sale1;
				}
				break;
			case 3:
				System.out.println("제품별 가격");
				for (int i = 0; i < sale.length; i++) {
					System.out.println(sale[i+1] + " : " + sale[i]);
				}
				break;
			case 4:
				System.out.println("분석");
				int max = 0;
				int sum = 0;
				for (int i = 0; i < sale.length; i++) {
					sum += (sale[i] - max);					
					if (sale[i] > max) {
						sale[i] = max;
						System.out.println("최고가격 : " + max);
					}										
					System.out.println("최고가격을 제외한 총합 : " + sum);
				}
				break;
			case 5:
				run = false;
				break;
			}

		}

		System.out.println("종료");

	}

}
