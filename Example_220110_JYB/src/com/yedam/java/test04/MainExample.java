package com.yedam.java.test04;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		Library library = new Library();
		String todo = null;

		while (run) {
			System.out.println("=== 1.할일입력 | 2.전체조회 | 3. 할일조회 | 4. 할일완료 | 5.종료 ===");
			System.out.print("선택> ");

			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1:
				System.out.print("할 일> ");
				todo = scanner.nextLine();
				library.addToday(todo);
				break;
			case 2:
				library.printTodayList();
				break;
			case 3:
				library.selectTodayInfo(todo);
				break;
			case 4:
				System.out.println("완료할 할 일을 선택해주세요> ");
				int number = Integer.parseInt(scanner.nextLine());

				library.checkToday(number);
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

}
