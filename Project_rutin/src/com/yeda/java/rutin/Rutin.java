package com.yeda.java.rutin;

public class Rutin {
	//
	private String check;
	private int date;
	private int time;
	private String rutinName;
	private String memo;
	
	//
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getRutinName() {
		return rutinName;
	}
	public void setRutinName(String rutinName) {
		this.rutinName = rutinName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	// ->수정
	@Override
	public String toString() {
		return "Rutin [check=" + check + ", date=" + date + ", time=" + time + ", rutinName=" + rutinName + ", memo="
				+ memo + "]";
	}
	
	

}
