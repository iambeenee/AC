package com.yedam.java.ch02_01;

public class Car {
	
	Tire frontLeftTire = new HankookTire();
	Tire forntRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		forntRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
