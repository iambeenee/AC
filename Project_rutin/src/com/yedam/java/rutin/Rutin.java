package com.yedam.java.rutin;

public class Rutin {
	//
	private int num;
	private int check; // 완료 미완료
	private String date; // 날짜
	private String time; // 시간
	private String name; // 이름
	private String memo; // 메모

	//
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	// (check == 1 ? " O\t" : " X\t")
}
