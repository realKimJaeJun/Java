package ch06_3__p181_190;
/*
 * 날짜: 2022/09/19
 * 이름: 김재준
 * 내용: static 변수 테스트하기
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); //serialNum 변수의 초깃값 출력
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
