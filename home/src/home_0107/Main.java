package home_0107;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		List<Book> list = new ArrayList<>();
		String name = null;
		Book book = null; // 공통적으로 사용을 많이해서 위로 끄집어 냄

		while (run) {
			System.out.println("=== 1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료 ===");
			System.out.println("선택");

			int menuNo = Integer.parseInt(scanner.nextLine()); // 책제목을 입력받기 때문에 Line을 쓰는게 좋다

			switch (menuNo) {
			case 1:
				System.out.println("책제목>");
				name = scanner.nextLine();
				System.out.println("저자명>");
				String writer = scanner.nextLine();
				book = new Book(name, writer);
				list.add(book);

				break;
			case 2:
				System.out.println("책번호	책제목	저자명	대여여부>");

				for (Book bookTemp : list) {
					System.out.println(bookTemp.getBookNum() + "   " + bookTemp.getBookName() + "   "
							+ bookTemp.getBookWriter() + "   " + (bookTemp.isRental() ? "대여중" : "대여가능"));

					// String isRental = "대여가능";
					// if(bookTemp.isRental())
					// isRental = "대여중";
				}
				break;
			case 3:
				System.out.println("책제목>");
				name = scanner.nextLine();

				System.out.println("책번호	책제목	저자명	대여여부>");

				for (Book bookTemp : list) {
					if (bookTemp.getBookName().equals(name)) {

						System.out.println(bookTemp.getBookNum() + "   " + bookTemp.getBookName() + "   "
								+ bookTemp.getBookWriter() + "   " + (bookTemp.isRental() ? "대여중" : "대여가능"));

					}
				}
				break;
			case 4:
				System.out.println("책제목>");
				name = scanner.nextLine();

				for (Book bookTemp : list) {
					if (bookTemp.getBookName().equals(name)) {
						if (bookTemp.isRental()) { // 대여중
							System.out.println("해당 책은 대여중입니다.");
						} else { // 대여가능
							bookTemp.setRental(true);
							System.out.println("대여되었습니다.");
						}
					}
				}
				break;
			case 5:
				System.out.println("책제목>");
				name = scanner.nextLine();

				for (Book bookTemp : list) {
					if (bookTemp.getBookName().equals(name)) {
						bookTemp.setRental(false);
						System.out.println("반납되었습니다.");
					}
				}
				break;
			case 6:
				run = false;
				System.out.println("프로그램 종료");
				break;

			}
		}

	}

}
