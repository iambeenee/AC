package com.yedam.java.rutin;

import java.util.List;

public interface RutinDAO { //DB연결
	// 루틴 생성
	public void createRutin(Rutin rutin);
	
	// 전체조회
	public List<Rutin> selectRutin();
	
	// 날짜별 전체 조회
	public Rutin selectOne(String date);

	// 수정
	public void updateRutin(Rutin rutin);
	
	//check
	public void checkRutin(Rutin rutin);

	// 삭제
	public void deleteRutin(int num);
	
	// 특정단어 검색 조회
	public void searchRutin(String strS);
	
	// 미완료 루틴 조회
	public Rutin comNot(Rutin rutin);
	
}
