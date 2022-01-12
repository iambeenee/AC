package com.yedam.java.test02;

public class Card {

	// 필드
	protected String cardNum; // -> 상속받으니까 private  x 
	protected int vaildDate; 	// 사용가능 대신 게터이용
	protected int cvc;

	// 생성자
	public Card(String cardNum, int vaildDate, int cvc) {
		this.cardNum = cardNum;
		this.vaildDate = vaildDate;
		this.cvc = cvc;
	}

	public Card(String cardNum) {
		this.cardNum = cardNum;
	}

	// 메소드
	public String getCardNum() {
		return cardNum;
	}

	public int getVaildDate() {
		return vaildDate;
	}

	public int getCVC() {
		return cvc;
	}

	public void showCardInfo() {
		System.out.println("카드정보 - Card NO : " + cardNum + ", 유효기간 : " + vaildDate + ", CVC : " + cvc);

		//System.out.printf("카드정보 ( Card No : %s, 유효기간 : %d, CVC : %d)\n", cardNum, vaildDate, cvc);

	}

}
