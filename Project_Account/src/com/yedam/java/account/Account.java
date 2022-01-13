package com.yedam.java.account;

public class Account {
	//	
	private long accountNo;
	private String accountOwner;
	private String accountPassword;
	private long accountBalance;
		
	//
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "Account [계좌번호 = " + accountNo + ", 계좌주명 = " + accountOwner + ", 잔액 = " + accountBalance + "]";
	}
	
	
}
