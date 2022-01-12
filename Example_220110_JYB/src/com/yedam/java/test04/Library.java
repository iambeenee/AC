package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// 필드
	private List<Work> list;

	// 생성자
	public Library() {
		list = new ArrayList<Work>();
	}

	// 메소드
	// 할일입력
	public void addToday(String todo) {
		list.add(new Work(todo));
	}

	// 전체조회
	public void printTodayList() {
		for (Work today : list) {
			System.out
					.println(today.getNum() + "번     " + today.getTodo() + (today.isCheck() ? "     완료" : "     미완료"));
		}
	}

	// 할일조회
	public void selectTodayInfo(String todo) {
		for (Work today : list) {
			//완료한할일 제외
			
			System.out.println(today.getNum() + "번     " + today.getTodo() + (today.isCheck() ? "     완료" : "     미완료"));
		}
	}

	// 할일완료
	public void checkToday(int number) {
		for (Work today : list) {
			if (today.getNum() == number) {
				if (today.isCheck()) {
					System.out.println("해당 할 일은 이미 완료되었습니다.");
				} else {
					today.setCheck(true);
					System.out.println("해당 할 일을 완료처리하였습니다.");
				}
			}
		}
	}
}
