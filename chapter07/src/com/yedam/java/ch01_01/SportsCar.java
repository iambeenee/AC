package com.yedam.java.ch01_01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	@Override
	public void stop() {	//메소드 final
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
	
	
}
