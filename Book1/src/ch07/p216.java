package ch07;
/*
 * 날짜: 2022/09/22
 * 이름: 김재준
 * 내용: 객체 배열의 깊은 복사
 */
public class p216 {
	public static void main(String[] args) {
		p207[] bookArray1 = new p207[3];
		p207[] bookArray2 = new p207[3];
		
		bookArray1[0] = new p207("태백산맥", "조정래");
		bookArray1[1] = new p207("데미안", "헤르만 헤세");
		bookArray1[2] = new p207("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new p207();
		bookArray2[1] = new p207();
		bookArray2[2] = new p207();
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
	}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
