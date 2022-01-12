package com.yedam.java.test04;

public class Work {

	// 필드
	private static int serialNum = 0;

	private int Num; // 번호
	private String todo; // 오늘할일
	private boolean check; // 완료 미완료

	// 생성자
	public Work(String todo) {
		serialNum++;
		this.Num = serialNum;
		this.todo = todo;
		this.check = false;
	}

	// 메소드
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Work.serialNum = serialNum;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

}
