package com.yedam.java.example1;

public class Subway {

	//필드
	private String lineNumber;
	private int money;
	private int passengerCount;
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	//메소드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
}
}
