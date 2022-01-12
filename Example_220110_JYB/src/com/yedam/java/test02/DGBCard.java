package com.yedam.java.test02;

public class DGBCard extends Card{

	//필드
	private String company = "대구은행";
	private String cardStaff;
		
	//생성자
	public DGBCard(String cardNum, int vaildDate, int CVC, String cardStaff, String company) {
		super(cardNum, vaildDate, CVC);
		this.cardStaff = cardStaff;
	}

	//메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO : " + getCardNum() + ", 유효기간 : " + getVaildDate() + ", CVC : " + getCVC());
		System.out.println("담당직원 - " + cardStaff + ", " + company);
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
