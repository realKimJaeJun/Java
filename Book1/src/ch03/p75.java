package ch03;
/*
 * 날짜: 2022/08/18
 * 이름: 김재준
 * 내용: 증가·감소 연산자를 사용하여 값 연산하기
 */
public class p75 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = ++gameScore;
		System.out.println(lastScore2);
		
		int value = 10;
		int num=++value;
		System.out.println(num);
		
		int value2=10;
		int num1=value2++;
		System.out.println(num1);
	}
}
