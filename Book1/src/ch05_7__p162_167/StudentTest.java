package ch05_7__p162_167;
/*
 * 날짜: 2022/09/13
 * 이름: 김재준
 * 내용: private 변수 테스트 / private 변수 접근
 */
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.getStudentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
