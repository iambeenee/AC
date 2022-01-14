package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yeda.java.rutin.Rutin;
import com.yeda.java.rutin.RutinDAO;
import com.yeda.java.rutin.RutinDAOImpl;

public class RutinFrame {

	private RutinDAO dao = RutinDAOImpl.getInstance();
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
				searchRutin();
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
		System.out.println("=== 1.회원가입 | 2.로그인 | 3.루틴 입력 | 4.루틴 조회 | 5.루틴 수정 | 6.루틴 삭제 | 7.로그아웃 | 9.종료 ===");
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

	// 루틴입력
	public void insertRutin() {
		//입력
		Rutin rutin = inputRutinInfo();
		//등록
		dao.createRutin(rutin);
	}

	// 루틴조회
	public int searchRutin() {
		System.out.println("1.전체 | 2.단건		번호만 입력해 주세요.");
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
			if (menuNo == 1) {
				//전체조회
				selectAll();
			} else if (menuNo == 2) {
				//단건조회
				selectOne();
			}
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
	
	//전체조회
	public void selectAll() {
		//조회
		List <Rutin> list = dao.selectAll();
		//출력
		for(Rutin rutin : list) {
			System.out.println(rutin);
		}
	}
	
	//단건조회
	public void selectOne() {
		//날짜입력
		int rutinDate = inputDate();
		//조회
		Rutin rutin = dao.selectOne(rutinDate);
		//출력
		if(rutin == null) {
			System.out.println("해당 날짜에 루틴이 없습니다.");
		} else {
			System.out.println(rutin);
		}
		
	}
	
	//내용 수정
	public void updateContent() {
		//날짜입력 -> 이름입력
		Rutin rutin = inputDate();
		//이름과 내용수정
		dao.updateContent(rutin);
		
	}
	
	//삭제
	public int deleteRutin(){
		System.out.println("1.전체 | 2.단건		번호만 입력해 주세요.");
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
			if (menuNo == 1) {
				//전체삭제
				deleteAll();
			} else if (menuNo == 2) {
				//단건
				deleteOne();
			}
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	//전체삭제
	public void deleteAll() {
		//날짜입력
		Rutin rutinDate = inputDate();
		//삭제
		dao.deleteAll(rutinDate);
	}
	
	//단건삭제
	public void deleteOne() {
		//날짜입력
		int rutinDate = inputDate();
		//루틴 제목 입력
		String rutinName = inputRutinName();
		//삭제
		dao.deleteOne(rutinDate, rutinName);
	}
	
	//종료
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	
	
	
	
	
//////////////input메소드 정의
	
	public Rutin inputRutinInfo() {
		Rutin rutin = new Rutin();
		System.out.println("날짜> ");
		rutin.setDate(Integer.parseInt(scanner.nextLine()));
		System.out.println("시간> ");
		rutin.setTime(Integer.parseInt(scanner.nextLine()));
		System.out.println("루틴 이름> ");
		rutin.setRutinName(scanner.nextLine());
		System.out.println("날짜> ");
		rutin.setMemo(scanner.nextLine());

		return rutin;
	}

	public Rutin inputDate() {
		Rutin rutin = new Rutin();
		System.out.println("날짜> ");
		rutin.setDate(I);
		return rutin;
	}
	
	
	
	

}
