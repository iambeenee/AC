package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.book.Book;
import com.yedam.java.book.BookDAO;
import com.yedam.java.book.BookDAOImpl;

public class BookFrame {

	private BookDAO dao = BookDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각 메뉴별 실행
			if (menuNo == 1) {
				// 전체조회
				selectAll();
			} else if (menuNo == 2) {
				// 단건조회
				selectOne();
			} else if (menuNo == 3) {
				// 내용검색
				
			} else if (menuNo == 4) {
				// 대여가능
			} else if (menuNo == 5) {
				// 책 대여
			} else if (menuNo == 6) {
				// 책 반납
			} else if (menuNo == 7) {
				// 책 등록
				insert();
			} else if (menuNo == 9) {
				// 종료
				end();
				break;
			}

		}
	}

	// 메뉴출력
	public void menuPrint() {
		System.out.println();
		System.out.println("=== 1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6.책 반납 | 7.책 등록 | 9.종료 ===");
		System.out.print("선택> ");
	}

	// 메뉴선택
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	// 전체조회
	public void selectAll() {
		List<Book> list = dao.selectAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}

	// 단건조회
	public void selectOne() {
		// 책 제목
		String bookName = inputBookName();
		// 조회
		Book book = dao.selectOne(bookName);
		// 출력
		if (book == null) {
			System.out.println("해당 책 정보가 존재하지 않습니다.");
		} else {
			System.out.println(book);
		}
	}
	
	//내용조회
	public Book bookContent() {
		// 단어 입력
		Book book = inputWord();
		// 결과 출력
		
	}

	// 책 대여여부
	// public void checkBook(String bookName) {
	// for(Book book : list) {
	// if()
	// }
	// }

	// 책 대여
	public void rentalBook(String bookName) {
		bookName = scanner.nextLine();
		if(bookName.equals() {
			if(book.getBookRental() == null) {
				System.out.println("대여 가능");
			} else {
				System.out.println("대여중");
			}
		}
		
	}

	// 책 반납

	// 책 등록
	public void insert() {
		// 책 정보 입력
		Book book = inputBookFull();
		// DB에 등록
		dao.insert(book);
	}

	// 종료
	public void end() {
		System.out.println("프로그램 종료");
	}

	// input메소드
	// 책 정보 전체 입력
	public Book inputBookFull() {
		Book book = new Book();
		System.out.println("책 이름> ");
		book.setBookName(scanner.nextLine());
		System.out.println("저자명> ");
		book.setBookName(scanner.nextLine());
		System.out.println("책 내용> ");
		book.setBookName(scanner.nextLine());
		return book;
	}

	// 책 이름 입력
	public String inputBookName() {
		String bookName = null;
		System.out.println("책 이름> ");
		bookName = (scanner.nextLine());
		return bookName;
	}
	
	//단어 검색
	public String inputWord() {
		private List<Book> list;
		for(Book book : list) {
			if
		}
	}
}
