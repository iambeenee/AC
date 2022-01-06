package com.yedam.java.test2;

public class Account {

	// 필드
	private String name;
	private long balance;

	// 생성자
	public Account(String name) {
		this.name = name;
	}

	// 메소드
	public long getBalance() {
		return balance;
	}

	public void withdraw(int money) {
		balance -= money;
	}

	public void deposit(int money) {
		balance += money;
	}

	public String getName() {
		return name;
	}

}
