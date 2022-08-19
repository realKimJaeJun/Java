package ch03;
/*
 * 날짜: 2022/08/19
 * 이름: 김재준
 * 내용: 단락 회로 평가 실습하기
 */
public class p78 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 앞 항이 거짓이라 뒷 항이 실행되지 않아 i값이 그대로
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 앞 항이 참이라 뒷 항이 실행되지 않아 i값이 그대로
		
		int num2 = 5;
		int u = 10;
		
		boolean value2 = ((num2 = num2 * 10) > 45) || ((u = u - 5) < 10);
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(u); // 앞 항이 참이라 뒷 항이 실행되지 않아 u값이 그대로
	}
}
