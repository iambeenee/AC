package com.yedam.java.rutin;

import java.util.List;

public interface RutinDAO { //DB연결
	// 루틴 생성
	public void createRutin(Rutin rutin);

	// 조회
	public List<Rutin> selectRutin(String key, String value);

	// 수정
	public void updateContent(Rutin rutin);

	// 삭제
	public void deleteAll(int num);
	
}
