package com.yedam.java.test03;

public class CardPayment implements Payment {

	// 필드
	private double cardRatio;

	// 생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
	double resultOnline = Payment.ONLINE_PAYMENT_RATIO + cardRatio;
		return resultOnline;
	}

	@Override
	public int offline(int price) {
		double resultOffline = Payment.OFFLINE_PAYMENT_RATIO + cardRatio;	
		return resultOffline;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " + resultOnline);
		System.out.println("오프라인 결제 시 총 할인율 : " + resultOffline);

	}

}
