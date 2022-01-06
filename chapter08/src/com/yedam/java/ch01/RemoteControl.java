package com.yedam.java.ch01;

public interface RemoteControl {

	//상수
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);	
	
	
	
	
	
	
	
	
	
}
