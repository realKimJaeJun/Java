package ch04;
/*
 * 날짜: 2022/08/22
 * 이름: 김재준
 * 내용: 나이에 따라 다른 문장 출력하기
 */
public class p94 {
	public static void main(String[] args) {
		int age = 7;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		char gender = 'F';
			if(gender == 'F') {
				System.out.println("여성입니다.");
			}
			else {
				System.out.println("남성입니다.");
			}
	}
}
