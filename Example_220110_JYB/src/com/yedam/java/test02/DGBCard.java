package com.yedam.java.test02;

public class DGBCard extends Card {

	// 필드
	private String company = "대구은행";
	private String cardStaff;

	// 생성자
	public DGBCard(String cardNum, int vaildDate, int cvc, String cardStaff) {
		super(cardNum, vaildDate, cvc);
		this.cardStaff = cardStaff;
	}

	// 메소드
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

}
