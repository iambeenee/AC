package home.date0107;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		// boolean check = true;
		List<Book> list = new ArrayList<>();

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.println("메뉴선택>");

			int menuNo = Integer.parseInt(scanner.nextLine());

			switch (menuNo) {
			case 1:
				System.out.println("책이름>");
				String bookName = scanner.nextLine();
				System.out.println("저자>");
				String author = scanner.nextLine();

				Book book = new Book(bookName, author);
				list.add(book);

				break;
			case 2:
				System.out.println("전체조회>");

				for (int i = 0; i < list.size(); i++) {
					Book temp = list.get(i);

					System.out.println(
							temp.getBookNum() + " )   " + temp.getBookName() + " : " + temp.getAuthor() + "  ");
				}

				break;
			case 3:
				System.out.println("단건조회>");
				String str = scanner.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getBookName())) {

						System.out.println(list.get(i).getBookNum() + " )   " + list.get(i).getBookName() + " : "
								+ list.get(i).getAuthor() + "  ");
					}
				}

				break;
			case 4:
				System.out.println("책 대여>");
				String checkIn = scanner.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (checkIn.equals(list.get(i).getBookName())) {

						System.out.println();
					}
				}

				break;
			case 5:
				System.out.println("책 반납>");
				break;
			case 6:
				System.out.println("종료>");
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}
