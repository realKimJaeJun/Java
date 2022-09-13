package ch05_7__p162_167;
/*
 * 날짜: 2022/09/13
 * 이름: 김재준
 * 내용: Private 사용 / get(), set() 메서드 사용
 */
public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
