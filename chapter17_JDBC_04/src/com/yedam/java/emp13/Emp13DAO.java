package com.yedam.java.emp13;

import java.util.List;

public interface Emp13DAO {

	//전체조회
	public List<Emp13> selectAll();
	
	//단건조회
	public Emp13 selectOne(int employeeId);
	
	//등록
	public void insert(Emp13 emp);
	
	//수정
	public void update(Emp13 emp);
	
	//삭제
	public void delete(int employeeId);
}
