package ch04;
/*
 * 날짜: 2022/08/22
 * 이름: 김재준
 * 내용: if-else if-else문으로 입장료 계산하기
 */
public class p97 {
	public static void main(String[] args) {
		int age = 67;
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
		else if(age >= 60){
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는 "+charge+"원입니다.");
		
		// 성적에 따라 학점부여
		
		int score = 32;
		char grade;
		
		System.out.print("금번 성적 등급은 ");
		if(score < 100 && score >89) {
			grade = 'A';
			System.out.println(grade+"입니다.");
		}
		else if(score < 90 && score >79) {
			grade = 'B';
			System.out.println(grade+"입니다.");
		}
		else if(score < 80 && score >69) {
			grade = 'C';
			System.out.println(grade+"입니다.");
		}
		else if(score < 70 && score >59) {
			grade = 'D';
			System.out.println(grade+"입니다.");
		}
		else {
			grade = 'F';
			System.out.println(grade+"입니다.");
		}
	}
}