package com.yedam.java.ch01;

public class MainExample {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new Television();
		rc1.turnOn();
		rc1 = new Audio();
		rc1.turnOn();

		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		rc.turnOn();
		Searchable searchable = tv;
		searchable.search("naver");

		System.out.println();

		System.out.println("1)-------------------------------");
		MyClass myclass1 = new MyClass();
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);

		System.out.println("2)-------------------------------");
		MyClass myclass2 = new MyClass(new Audio());

		System.out.println("3)-------------------------------");
		MyClass myclass3 = new MyClass();
		myclass3.methodA();

		System.out.println("4)-------------------------------");
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());

	}
}