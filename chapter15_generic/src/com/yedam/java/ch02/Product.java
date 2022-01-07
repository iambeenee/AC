package com.yedam.java.ch02;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public T getkind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
}
