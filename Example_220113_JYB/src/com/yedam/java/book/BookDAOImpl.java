package com.yedam.java.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class BookDAOImpl extends DAO implements BookDAO {
	//
	private static BookDAO instance = new BookDAOImpl();

	private BookDAOImpl() {
	}

	public static BookDAO getInstance() {
		return instance;
	}

	//
	@Override
	public List<Book> selectAll() {
		List<Book> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM book ORDER BY book_name";
			pstmt = conn.prepareStatement(select);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));

				list.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void insert(Book book) {
		try {
			connect();
			String insert = "INSERT INTO book VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookWriter());
			pstmt.setString(3, book.getBookContent());
			pstmt.setInt(4, book.getBookRental());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상등록되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void update(Book book) {
		try {
			connect();
			String update = "UPDATE book SET book_rental = ? WHERE book_name = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, book.getBookRental());
			pstmt.setString(2, book.getBookName());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상등록되었습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Book selectBook(String bookName) {
		Book book = null;
		try {
			connect();
			String select = "SELECT * FROM book WHERE book_name = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, bookName);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;
	}

}
