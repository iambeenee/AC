package com.yedam.java.account;

import java.sql.SQLException;

import com.yedam.java.common.DAO;

public interface AccountDAO {

	// 계좌조회
	public Account selectAccountInfo(long accountNo);

	// 계좌개설 즉시 계좌번호 조회
	public long selectAccountNo(Account account);

	// 계좌개설
	public void createAccount(Account account);

	// 계좌잔액수정
	public void updateAccount(Account account);

}
