package ch07;
/*
 * 날짜: 2022/09/21
 * 이름: 김재준
 * 내용: 객체 배열 만들기(3)
 */
public class p209 {
	public static void main(String[] args) {
		p207[] library = new p207[5]; //p207 == Book
		
		library[0] = new p207("태백산맥", "조정래");
		library[1] = new p207("데미안", "헤르만 헤세");
		library[2] = new p207("어떻게 살 것인가", "유시민");
		library[3] = new p207("토지", "박경리");
		library[4] = new p207("어린왕자", "생택쥐페리");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
