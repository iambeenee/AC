package com.yedam.java.rutin;

public class Rutin {
	//
	private int num;
	private int complete; // 완료 미완료
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

	public int getComplete() {
		return complete;
	}

	public void setComplete(int complete) {
		this.complete = complete;
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

	@Override
	public String toString() {
		return " " + num + ") "+ "날짜 " + date + "   시간 " + time + "   루틴 : " + name
				+ "   메모 : " + memo + "   완료 : " + (complete == 1 ? "O" : "X");
	}

	//
	

	
}
