package com.yedam.java.app;

import java.util.Scanner;

import com.yedam.java.log.Log;
import com.yedam.java.log.LogDAO;
import com.yedam.java.log.LogDAOImpl;

public class LogFrame {
	private LogDAO dao = LogDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
	boolean run = true;

	public LogFrame() {

		while (run) {
			// 메뉴출력
			menuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();

			// 각 메뉴별 실행
			if (menuNo == 1) {
				// 회원가입
				singUp();
			} else if (menuNo == 2) {
				// 로그인
				login();
			} else if (menuNo == 9) {
				// 종료
				end();
				run = false;
				break;

			}
		}
	}

	// 메뉴출력
	public void menuPrint() {
		System.out.println();
		System.out.println(" ┌───────────────────────────┐");
		System.out.println(" │ 1 회원가입 | 2 로그인 | 9 종료 │||");
		System.out.println(" └───────────────────────────┘");
		System.out.print("** 선택> ");
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

	// 회원가입
	public void singUp() {
		// 정보 입력
		Log log = inputLogInfo();
		dao.createUser(log);
	}

	// 로그인
	public void login() {
		System.out.print("* 아이디 > ");
		String strId = scanner.nextLine();
		System.out.print("* 비밀번호 > ");
		String strPwd = scanner.nextLine();
		new RutinFrame(dao.loginUser(strId, strPwd));
	}

	// 종료
	public void end() {
		System.out.println("***** 프로그램 종료 *****");
	}

	public Log inputLogInfo() {
		Log log = new Log();
		System.out.print("* 아이디 > ");
		log.setId(scanner.nextLine());
		System.out.print("* 비밀번호 > ");
		log.setPassword(scanner.nextLine());
		System.out.print("* 이름 > ");
		log.setUserName(scanner.nextLine());
		System.out.print("* 전화번호 >");
		log.setPhone(scanner.nextLine());

		return log;
	}

}
