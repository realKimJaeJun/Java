package ch05;
/*
 * 날짜: 2022/09/06
 * 이름: 김재준
 * 내용: 참조 값 출력하기
 */
public class p150 {
	public static void main(String[] args) {
		p144 student1 = new p144();
		student1.studentName = "안연수";
		
		p144 student2 = new p144();
		student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student2);
		
		
		p144 person1 = new p144();
	}
}
