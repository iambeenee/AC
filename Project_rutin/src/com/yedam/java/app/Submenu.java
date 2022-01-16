package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.yedam.java.rutin.Rutin;
import com.yedam.java.rutin.RutinDAO;
import com.yedam.java.rutin.RutinDAOImpl;
import com.yedam.java.rutin.Util;

public class Submenu {		////// 조회 서브메뉴
	
	private RutinDAO dao = RutinDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
	boolean run = true;

	public void subSelectRutin() {
		while (true) {
			// 메뉴출력
			searchMenuPrint();
			// 메뉴 선택
			int menuNo = menuSelect();
			// 각 메뉴별 실행
			if (menuNo == 1) {
				//오늘 일정
				todayR();
			} else if (menuNo == 2) {
				//특정 일
				dayR();
			} else if (menuNo == 3) {
				//특정 월
				monthR();
			} else if (menuNo == 4) {
				//전체
				fullR();
			} else if (menuNo == 5) {
				//특정 단어
				wordR();
			} else if (menuNo == 9) {
				//종료
				run = false;
				break;
			}
		}
	}
		
	public void searchMenuPrint(){
		System.out.println();
		System.out.println(" │ 1 오늘 | 2 특정 일 | 3 특정 월 | 4 전체 | 5 특정 단어 | 9 종료 | ");
		System.out.println("** 선택> ");
	}
		
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("** 없는 메뉴입니다. **");
		}
		return menuNo;
	}
		
	public void todayR() {
		String today = Util.toDayString("YYYY-MM-dd");
		List<Rutin> temp = dao.selectRutin("today",today);
		print();
		int sum = 0;
		for(Rutin rutin : temp) {
			System.out.printf(" %s   %s      %s      %s      %s%n", 
					rutin.getNum(),rutin.getDate(), rutin.getTime(), rutin.getName(), rutin.getMemo());
		sum++;
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%s개 일정이 있습니다.%n",sum);
		System.out.printf("%n");

	}
		
	public void dayR() {
		System.out.println("특정 일 (YYYY- MM-dd) > ");
		String strDate = "\\d{4}-\\d{2}-\\d{2}";
		String day = scanner.nextLine();
		if(!Pattern.matches(strDate, day)) {
			System.out.println("잘못 입력하셨습니다. (yyyy-MM-dd)");
			return;
		}
		
		List<Rutin> temp = dao.selectRutin("day", day);
		print();
		int sum = 0;
		for(Rutin rutin : temp) {
			System.out.printf(" %s   %s      %s      %s      %s%n", 
					rutin.getNum(),rutin.getDate(), rutin.getTime(), rutin.getName(), rutin.getMemo());
			sum++;
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%s개 일정이 있습니다.%n",sum);
		System.out.printf("%n");
	}
	
	public void monthR() {
		System.out.println("특정 월 (YYYY-MM) > ");
		String strDate = "\\d{4}-\\d{2}";
		String month = scanner.nextLine();
		if(!Pattern.matches(strDate, month)) {
			System.out.println("잘못 입력하셨습니다. (yyyy-MM-dd)");
			return;
		}
		List<Rutin> temp = dao.selectRutin("month", month);
		print();
		int sum = 0;
		for(Rutin rutin : temp) {
			System.out.printf(" %s   %s      %s      %s      %s%n", 
					rutin.getNum(),rutin.getDate(), rutin.getTime(), rutin.getName(), rutin.getMemo());
			sum++;
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%s개 일정이 있습니다.%n",sum);
		System.out.printf("%n");
	}
	
	public void wordR() {
		System.out.println("특정 단어 > ");
		String word = scanner.nextLine();
		
		List<Rutin> temp = dao.selectRutin("word", word);
		print();
		int sum = 0;
		for(Rutin rutin : temp) {
			System.out.printf(" %s   %s      %s      %s      %s%n", 
					rutin.getNum(),rutin.getDate(), rutin.getTime(), rutin.getName(), rutin.getMemo());
			sum++;
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%s개 일정이 있습니다.%n",sum);
		System.out.printf("%n");		
	}
	
	public void fullR() {
		String full = "";
		List<Rutin> temp = dao.selectRutin("full", full);
		print();
		int sum = 0;
		for(Rutin rutin : temp) {
			System.out.printf(" %s   %s      %s      %s      %s%n", 
					rutin.getNum(),rutin.getDate(), rutin.getTime(), rutin.getName(), rutin.getMemo());
			sum++;
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("%s개 일정이 있습니다.%n",sum);
		System.out.printf("%n");
	}
	
	public void print() {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println(" 번호   날짜               시간       이름       메모");
		System.out.println("------------------------------------------------");
	}
}


