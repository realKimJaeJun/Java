package ch04;
/*
 * 날짜: 2022/08/24
 * 이름: 김재준
 * 내용: 중첩된 반복문
 */
public class p116 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++)
			System.out.println(dan + "X" + times + "=" + dan * times);
		}
		System.out.println( );
	}
}
