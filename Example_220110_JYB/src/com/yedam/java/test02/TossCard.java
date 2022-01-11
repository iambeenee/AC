package com.yedam.java.test02;

public class TossCard extends Card {

	// 필드
	private String company;
	private String cardStaff;

	// 생성자
	public TossCard(String cardNum) {
	}
	
	public TossCard(String cardStaff, String company) {
		this.cardStaff = cardStaff;
		this.company = "Toss";
	}

	// 메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + getCardNum());
		System.out.println("담당직원 - " + getCardStaff() + ", " + company);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCardStaff() {
		return cardStaff;
	}

	public void setCardStaff(String cardStaff) {
		this.cardStaff = cardStaff;
	}

}
