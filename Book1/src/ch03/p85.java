package ch03;
/*
 * 날짜: 2022/08/22
 * 이름: 김재준
 * 내용: 비트 이동 연산자를 사용하여 연산하기
 */
public class p85 {
	public static void main(String[] args) {
		int num = 00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>>2);
		
		System.out.println(num);
		
		num = num <<2;
		System.out.println(num);
	}

}
