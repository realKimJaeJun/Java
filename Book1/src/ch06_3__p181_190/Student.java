package ch06_3__p181_190;
/*
 * 날짜: 2022/09/19
 * 이름: 김재준
 * 내용: static 변수 사용하기
 */
public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
