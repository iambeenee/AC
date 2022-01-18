package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.rutin.Rutin;
import com.yedam.java.rutin.RutinDAO;
import com.yedam.java.rutin.RutinDAOImpl;

public class RutinFrame {

	private RutinDAO dao = RutinDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);

	public RutinFrame(int result) { // ->각각을 메소드로 구현

		if (result == 1) {
			while (true) {
				// 메뉴출력
				menuPrint();
				// 메뉴 선택
				int menuNo = menuSelect();

				// 각 메뉴별 실행
				if (menuNo == 1) {
					// 루틴 입력
					insertRutin();
				} else if (menuNo == 2) {
					// 전체
					selectRutin();
				} else if (menuNo == 3) {
					// 일별
					selectDate();
				} else if (menuNo == 4) {
					// 단어
					searchWord();
				} else if (menuNo == 5) {
					// 수정
					updateContent();
				} else if (menuNo == 6) {
					// 완료
					selectCheck();
				} else if (menuNo == 7) {
					// 삭제
					deleteRutin();
				} else if (menuNo == 9) {
					end();
					break;
				}
			}
		} else if (result == 0) {
			System.out.println("** 비번 불일치 **");

		} else if (result == -1) {
			System.out.println("** 회원 아님 **");
		}
	}

	////////////// 기본메소드 정의

	// 메뉴출력
	public void menuPrint() {
		System.out.println();
		System.out.println(" ┌────────────────────────────────────────────────────────────────────────────────────┐");
		System.out.println(" │ 1 입력 | 2 전체 조회 | 3 일별 조회 | 4 단어 조회 | 5 수정 | 6 루틴 완료하기 │ 7 삭제 | 9 첫 화면 |||");
		System.out.println(" └────────────────────────────────────────────────────────────────────────────────────┘");
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
		// 입력
		Rutin rutin = inputRutinInfo();
		// 등록
		dao.createRutin(rutin);
	}

	// 전체 루틴조회
	public void selectRutin() {
		int sum = 0;
		List<Rutin> list = dao.selectRutin();
		for (Rutin rutin : list) {
			sum++;
			System.out.println(rutin);
		}
		System.out.println();
		System.out.printf("* 총 %s개의 일정이 있습니다.%n", sum);
	}

	// 일별
	public void selectDate() {
		int sum = 0;
		// 날짜입력
		String date = inputDate();
		// 조회
		List<Rutin> list = dao.selectOne(date);
		for (Rutin rutin : list) {
			sum++;
			System.out.println(rutin);
		}
		System.out.println();
		System.out.printf("* 총 %s개의 일정이 있습니다.%n", sum);
	}

	// 단어
	public void searchWord() {
		int sum = 0;
		String keyword = inputWord();
		List<Rutin> list = dao.selectRutin();
		for (Rutin rutin : list) {
			if ((rutin.getName().indexOf(keyword) != -1) || (rutin.getMemo().indexOf(keyword) != -1)) {
				sum++;
				System.out.println(rutin);
			}
		}
		System.out.println();
		System.out.printf("* 총 %s개의 일정이 있습니다.%n", sum);

	}

	// 내용 수정
	public void updateContent() {
		selectRutin();
		Rutin rutin = updateNum();
		// 실행
		dao.updateRutin(rutin);
		
		
	}

	// 완료 미완료
	public void selectCheck() {
		int sum = 0;
		List<Rutin> list = dao.selectRutin();
		for (Rutin rutin : list) {
			if (rutin.getComplete() == 0) {
				sum++;
				System.out.println(rutin);
			}
		}
		System.out.println();
		System.out.printf("* 총 %s개의 일정이 있습니다.%n", sum);

		Rutin rutin = new Rutin();
		System.out.println();
		System.out.print("* 완료하고 싶은 날짜의 번호 > ");
		rutin.setNum(Integer.parseInt(scanner.nextLine()));
		rutin.setComplete(1);
		dao.checkRutin(rutin);

	}

	// 삭제
	public void deleteRutin() {
		selectRutin();
		int num = deleteNum();
		dao.deleteRutin(num);
	}

	// 종료
	public void end() {
		System.out.println("***** 첫 화면으로 돌아갑니다. *****");
	}

//////////////input메소드 정의

	public Rutin inputRutinInfo() {
		Rutin rutin = new Rutin();
		System.out.print("* 날짜 (YYYY-MM-dd) > ");
		rutin.setDate(scanner.nextLine());
		System.out.print("* 시간 (HH:mm) > ");
		rutin.setTime(scanner.nextLine());
		System.out.print("* 이름 > ");
		rutin.setName(scanner.nextLine());
		System.out.print("* 메모 > ");
		rutin.setMemo(scanner.nextLine());

		return rutin;
	}

	public String inputDate() {
		System.out.print("* 날짜 (YYYY-MM-dd) > ");
		return scanner.nextLine();
	}

	public int inputNum() {
		System.out.print("* 삭제할 번호 > ");
		return (Integer.parseInt(scanner.nextLine()));
	}

	public Rutin updateNum() {
		Rutin rutin = new Rutin();
		System.out.println();
		System.out.print("* 수정할 번호 > ");
		rutin.setNum(Integer.parseInt(scanner.nextLine()));
		System.out.print("* 날짜 (YYYY-MM-dd) > ");
		rutin.setDate(scanner.nextLine());
		System.out.print("* 시간 입력 (HH:mm) > ");
		rutin.setTime(scanner.nextLine());
		System.out.print("* 이름 입력 > ");
		rutin.setName(scanner.nextLine());
		System.out.print("* 메모 입력 > ");
		rutin.setMemo(scanner.nextLine());

		return rutin;
	}

	public int deleteNum() {
		System.out.println();
		System.out.print("* 삭제할 번호 > ");
		return (Integer.parseInt(scanner.nextLine()));

	}

	public String inputWord() {
		System.out.print("* 단어 >");
		return scanner.nextLine();
	}

}
