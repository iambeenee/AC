package com.yedam.java.test02;

public class Card {

	// 필드
	private String cardNum;
	private int vaildDate;
	private int CVC;

	// 생성자
	public Card() {
		
	}
	
	public Card(String cardNum, int vaildDate, int CVC) {
		this.cardNum = cardNum;
		this.vaildDate = vaildDate;
		this.CVC = CVC;
	}
	
	public Card(String cardNum) {
		this.cardNum = cardNum;
	}
	
	/*
	public Card(String cardNum) {
		this.cardNum = cardNum;
	}
	public Card(String cardNum, int vaildDate, int CVC) {
		this.cardNum = cardNum;
		this.vaildDate = vaildDate;
		this.CVC = CVC;
	}
*/
	// 메소드
	public String getCardNum() {
		return cardNum;
	}

	public int getVaildDate() {
		return vaildDate;
	}

	public int getCVC() {
		return CVC;
	}

	public void showCardInfo() {
		System.out.println(
				"카드정보 - Card NO : " + getCardNum() + ", 유효기간 : " + getVaildDate() + ", CVC : " + getCVC());
	}

}
