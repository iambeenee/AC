package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		List<Work> list = new ArrayList<>();

		Work work = null;
		int Num = 0;

		while (run) {
			System.out.println("=== 1.할일입력 | 2.전체조회 | 3. 할일조회 | 4. 할일완료 | 5.종료 ===");
			System.out.print("선택> ");

			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1:
				System.out.print("할 일> ");
				String todo = scanner.nextLine();
				work = new Work(todo);
				list.add(work);
				break;
			case 2:
				for (Work w : list) {
					System.out.println(w.getNum() + "번 " + w.getTodo() + "  " + (w.isCheck() ? "완료" : "미완료"));

				}
				break;
			case 3:
				for (Work w : list) {
					if (!w.isCheck()) {
						System.out.println(w.getNum() + "번 " + w.getTodo() + "  " + (w.isCheck() ? "완료" : "미완료"));
					}
				}
				break;
			case 4:
				System.out.println("완료할 할 일을 선택해주세요> ");

				Num = Integer.parseInt(scanner.nextLine());
				for (Work w : list) {
					if (w.getNum() == Num) {
						if (w.isCheck()) {
							System.out.println("해당 할 일은 이미 완료되었습니다.");
						} else {
							w.setCheck(true);
							System.out.println("해당 할 일을 완료처리하였습니다.");
						}
					}
				}

				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}
}
