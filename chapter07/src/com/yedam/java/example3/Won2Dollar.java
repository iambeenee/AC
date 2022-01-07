package com.yedam.java.example3;

public class Won2Dollar extends Converter {

	
	
	public Won2Dollar(double ratio) {
		super(ratio);
	}
	@Override
	protected double convert(double src) {	
		return src / ratio;
	}

	@Override
	protected String getSrcString() {	//원
		return "원";
	}

	@Override
	protected String getDestString() {	//달러
		return "달러";
	}

}


