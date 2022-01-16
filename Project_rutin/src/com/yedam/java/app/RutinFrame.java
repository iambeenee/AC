package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.yedam.java.rutin.Rutin;
import com.yedam.java.rutin.RutinDAO;
import com.yedam.java.rutin.RutinDAOImpl;

public class RutinFrame {

	private RutinDAO dao = RutinDAOImpl.getInstance();
	Submenu sm = new Submenu();
	private Scanner scanner = new Scanner(System.in);

	public RutinFrame() { // ->각각을 메소드로 구현
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();

			// 각 메뉴별 실행
			if (menuNo == 1) {
				// 회원가입
				// singUp();
			} else if (menuNo == 2) {
				// 로그인
				// login();
			} else if (menuNo == 3) {
				// 루틴 입력
				insertRutin();
			} else if (menuNo == 4) {
				// 루틴 조회
				sm.subSelectRutin();
			} else if (menuNo == 5) {
				// 루틴 수정
				updateContent();
			} else if (menuNo == 6) {
				// 루틴 삭제
				deleteRutin();
			} else if (menuNo == 7) {
				// 로그아웃
				//logout();
			} else if (menuNo == 9) {
				// 프로그램 종료
				end();
				break;
			}
		}
	}

	////////////// 기본메소드 정의
	// 메뉴출력
	public void menuPrint() {
		System.out.println();
		System.out.println(" ┌───────────────────────────────────────────────────────────────────────────────────────┐");
		System.out.println(" │ 1 회원가입 | 2 로그인 | 3 루틴 입력 | 4 루틴 조회 | 5 루틴 수정 | 6 루틴 삭제 | 7 로그아웃 | 9 종료  │||");
		System.out.println(" └───────────────────────────────────────────────────────────────────────────────────────┘");
		System.out.println("** 선택> ");
	}

	// 메뉴선택
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("** 없는 메뉴입니다. **");
		}
		return menuNo;
	}

	// 루틴입력
	public void insertRutin() {
		//입력
		Rutin rutin = inputRutinInfo();
		//등록
		dao.createRutin(rutin);
	}
	
	//내용 수정
	public void updateContent() {
		sm.fullR();
		
		System.out.println("수정할 번호 입력 > ");
		int num = Integer.parseInt(scanner.next());
		
		Rutin rutin = new Rutin();
		System.out.println("------수정 중-------");
		System.out.println("날짜 입력 (YYYY-MM-dd) > ");
		rutin.setDate(scanner.nextLine());
		
		System.out.println("시간 입력 (HH:mm) > ");
		rutin.setTime(scanner.nextLine());
		
		System.out.println("이름 입력 > ");
		rutin.setName(scanner.nextLine());
		
		System.out.println("메모 입력 > ");
		rutin.setMemo(scanner.nextLine());
	}

	//삭제
	public void deleteRutin() {
		sm.fullR();
		System.out.println("삭제할 번호 입력 > ");
		int num = Integer.parseInt(scanner.next());
		
		System.out.println("정말 삭제하시겠습니까? (y / n)");
		if(scanner.nextLine().equals("y")) {
			dao.deleteAll(num);
		}
	}
	
	//종료
	public void end() {
		System.out.println("***** 프로그램 종료 *****");
	}
	
//////////////input메소드 정의
	
	public Rutin inputRutinInfo() {
		Rutin rutin = new Rutin();
		System.out.print("날짜 (YYYY-MM-dd) > ");
		rutin.setDate(scanner.nextLine());

		System.out.print("시간 (HH:mm) > ");
		rutin.setTime(scanner.nextLine());

		System.out.print("이름 > ");
		rutin.setName(scanner.nextLine());

		System.out.println("메모 > ");
		rutin.setMemo(scanner.nextLine());

		return rutin;
	}
	
}
