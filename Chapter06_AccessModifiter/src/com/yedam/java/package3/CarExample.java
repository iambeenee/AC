package com.yedam.java.package3;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		if(!myCar.isstop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getSpeed());
	}

}
