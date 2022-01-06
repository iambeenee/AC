package com.yedam.java.ch02_02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		//driver.drive(new Bus());
		//driver.drive(new Taxi());
		
		System.out.println();
		
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
		System.out.println();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
