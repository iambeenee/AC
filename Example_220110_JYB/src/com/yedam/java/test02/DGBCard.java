package com.yedam.java.test02;

public class DGBCard extends Card{

	//필드
	private String company = "대구은행";
	private String cardStaff;
		
	//생성자
	public DGBCard(int cardNum, int vaildDate, int CVC, String company, String cardStaff) {
		super(cardNum, vaildDate, CVC);
		this.cardStaff = cardStaff;
	}

	//메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : " + getCardNum() + ", 유효기간 : " + getVaildDate() + ", CVC : " + getCVC());
		System.out.println("담당직원 : " + cardStaff + company);
	}
	

}
