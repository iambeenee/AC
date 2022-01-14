package com.yeda.java.rutin;

import java.util.List;

public interface RutinDAO {
	// 입력
	public void createRutin(Rutin rutin);

	// 전체 조회
	public List<Rutin> selectAll();

	// 단건 조회
	public Rutin selectOne(int date);

	// 수정
	public void updateContent(Rutin rutin);

	// 전체 삭제
	public void deleteAll(Rutin rutin);
	
	// 단건 삭제
	public void deleteOne(int date, String name);

}
