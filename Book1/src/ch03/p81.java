package ch03;
/*
 * 날짜: 2022/08/22
 * 이름: 김재준
 * 내용: 조건 연산자를 사용하여 부모님의 나이 비교하기
 */
public class p81 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
			
			System.out.println(ch);
			
			int num = 10;
			boolean isEven;
			isEven = (num % 2) == 0 ? true : false;
			System.out.println(isEven);
	}
}
