package home.date0107;

public class Book {

	// 필드
	private String bookName;
	private String author;

	// 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	// 메소드
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
