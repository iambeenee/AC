package com.yedam.java.example1;

public class NamedCircle extends Circle {

	//필드
	private String name;

	//생성자
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}

	//메소드
	public void show() {
		System.out.println(name + ", 반지름 = " + getRadius()); //-> radius는 private라서 private를 protected로 바꾸던가 get`살아있으니 이용
	}

}
