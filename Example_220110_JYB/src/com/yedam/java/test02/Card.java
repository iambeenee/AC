package com.yedam.java.test02;

public class Card {

	// 필드
	private int cardNum;
	private int vaildDate;
	private int CVC;

	// 생성자
	public Card (int cardNum, int vaildDate, int CVC) {
		this.cardNum = cardNum;
		this.vaildDate = vaildDate;
		this.CVC = CVC;
	}

	//메소드
	public int getCardNum() {
		return cardNum;
	}

	public int getVaildDate() {
		return vaildDate;
	}

	public int getCVC() {
		return CVC;
	}

	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + getCardNum() + ", 유효기간 : " + getVaildDate() + ", CVC : " + getCVC() + " )");
	}

}
