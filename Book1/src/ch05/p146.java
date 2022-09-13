package ch05;
/*
 * 날짜: 2022/09/04
 * 이름: 김재준
 * 내용: StudentTest 실행 클래스 만들기
 */
public class p146 {

	public static void main(String[] args) {
		p144 studentAhn = new p144();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
