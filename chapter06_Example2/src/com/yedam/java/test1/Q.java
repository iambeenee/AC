package com.yedam.java.test1;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		Product[] list = null;
		int productNum = 0;

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("메뉴선택>");

			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				System.out.print("상품 수>");
				productNum = scanner.nextInt();
				list = new Product[productNum];
				break;
			case 2:
				for (int i = 0; i < list.length; i++) {
					System.out.println("상품명>");
					String name = scanner.next(); // 넥스트 인트를 위에 썻기 때문에 넥스트 라인 못쓴다.
					System.out.println("가격>");
					int price = scanner.nextInt();

					Product product = new Product(name, price);
					list[i] = product;
				}
				break;
			case 3:
				for (Product product : list) { // 향상된 for문
					System.out.printf("%s : %d", product.getName(), product.getPrice());
					System.out.println();
					// System.out.println(list[i].getName() + " : " + list[i].getPrice());
				}
				break;
			case 4:
				int max = 0;
				for (int i = 0; i < list.length; i++) {
					if (max < list[i].getPrice()) {
						max = list[i].getPrice();
					}
				}

				String name = null;
				int sum = 0;

				for (int i = 0; i < list.length; i++) {
					if (list[i].getPrice() == max) {
						name = list[i].getName();
						continue;
					}
					sum += list[i].getPrice();
				}

				System.out.println("최고 가격을 가진 제품은 " + name + "입니다.");
				System.out.println("최고 가격을 제외한 제품들의 합은 " + sum + "입니다.");
				break;
			case 5:
				run = false;
				break;
			}

		}

		System.out.println("프로그램을 종료합니다.");

	}

}
