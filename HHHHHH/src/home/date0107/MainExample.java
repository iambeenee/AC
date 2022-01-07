package home.date0107;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.println("메뉴선택>");

			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1 :
				System.out.println("상품명>");
				String name = scanner.nextLine();
				System.out.println("가격>");
				int price = Integer.parseInt(scanner.nextLine());
				
				
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 6 :
				run = false;
				break;
		
			}

		}
	}
}