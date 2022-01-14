package com.yedam.java.book;

import java.util.List;

public interface BookDAO {
	//전체조회
	public List<Book> selectAll(); 
	
	//단건조회
	public Book selectBook(String bookName);
	
	//책 등록
	public void insert(Book book);
	
	//수정
	public void update(Book book);
	
}
