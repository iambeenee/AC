package com.yedam.java.log;

public interface LogDAO {

	//회원가입
	public void createUser(Log log);
	
	//로그인
	public int loginUser(String id, String password);
	
}
