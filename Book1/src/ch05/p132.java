package ch05;
/*
 * 날짜: 2022/08/30
 * 이름: 김재준
 * 내용: 학생 이름과 주소 출력하는 메서드 만들기
 */
public class p132 {
	int studentId;		// 학번
	String studentName;	// 학생 이름
	int grade;			// 학년
	String address;		// 사는 곳
	
	public void showStudentInfo( ) {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}
}
