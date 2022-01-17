package com.yedam.java.log;

public class Log {
	private String id;
	private String password;
	private String userName;
	private String phone;
	
	//
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//
	@Override
	public String toString() {
		return "Log [id=" + id + ", password=" + password + ", userName=" + userName + ", phone=" + phone + "]";
	}
	
	
}
