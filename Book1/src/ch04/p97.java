package ch04;
/*
 * 날짜: 2022/08/22
 * 이름: 김재준
 * 내용: if-else if-else문으로 입장료 계산하기
 */
public class p97 {
	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는 "+charge+"원입니다.");
	}
}