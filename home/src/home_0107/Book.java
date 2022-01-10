package home_0107;

public class Book {

	//필드
	private static int serialNum = 0;
	
	private int bookNum;		//책번호
	private String bookName;	//책이름
	private String bookWriter;	//저자명
	private boolean rental;		//대여여부
	
	public Book(String bookName, String bookWriter) { //처음에 입력받을 것과 필드에서 초기화 할것들을 초기화해줌
		serialNum++;
		this.bookNum = serialNum;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.rental = false;
	}
	
	
	//책번호
	//책이름
	//저자명
	//대여여부
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
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public boolean isRental() {
		return rental;
	}
	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	
	
}
