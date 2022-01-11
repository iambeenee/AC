package com.yedam.java.test03;

public class CardPayment implements Payment {

	// 필드
	private double cardRatio;

	// 생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	// 메소드

	@Override
	public int online(int price) {
		double discount = price - (price * (Payment.ONLINE_PAYMENT_RATIO + cardRatio));
		return (int) discount;
	}

	@Override
	public int offline(int price) {
		double discount = price - (price * (Payment.OFFLINE_PAYMENT_RATIO + cardRatio));
		return (int) discount;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (Payment.ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제 시 총 할인율 : " + (Payment.OFFLINE_PAYMENT_RATIO + cardRatio));

	}

}
