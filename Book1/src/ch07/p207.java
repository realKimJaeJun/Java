package ch07;
/*
 * 날짜: 2022/09/21
 * 이름: 김재준
 * 내용: 객체 배열 만들기(1)  
 */
public class p207 { //p207 == book
	private String bookName;
	private String author;
	
	public p207() {}
	
	public p207(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
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
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
