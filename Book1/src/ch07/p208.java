package ch07;
/*
 * 날짜: 2022/09/21
 * 이름: 김재준
 * 내용: 객체 배열 만들기(2)  
 */
public class p208 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
