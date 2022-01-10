package com.yedam.java.test03;

public class SimplePayment implements Payment {

	//필드
	private double simplePaymentRatio;
	
	//생성자
	public SimplePayment (double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	@Override
	public int online(int price) {
		double resultOnline = Payment.ONLINE_PAYMENT_RATIO + simplePaymentRatio;
		return resultOnline;
	}

	@Override
	public int offline(int price) {
		double resultOffline = Payment.OFFLINE_PAYMENT_RATIO + simplePaymentRatio;
		return resultOffline;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율: " + resultOnline);
		System.out.println("오프라인 결제 시 총 할인율: " + resultOffline);
	}

}
