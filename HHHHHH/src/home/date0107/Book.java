package home.date0107;

public class Book {

	// 필드
	private static int serialNum = 0;

	private String bookName;
	private String author;
	private int bookNum;
	private String check;

	// 생성자
	public Book(String bookName, String author) {
		serialNum++;
		bookNum = serialNum;
		this.bookName = bookName;
		this.author = author;
		check = "대여가능";
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

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Book.serialNum = serialNum;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book book = (Book) obj;
		//	boolean isBookName = (bookName == this.bookName);
			if (bookName == this.bookName);
			return true;
		} else {
			return false;
		}

	}
}


