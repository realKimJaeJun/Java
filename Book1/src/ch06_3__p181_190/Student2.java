package ch06_3__p181_190;
/*
 * 날짜: 2022/09/19
 * 이름: 김재준
 * 내용: serialNum의 get(), set() 메서드 사용하기
 */
public class Student2 {
	private static int serialNum = 1000; //private 변수로 변경
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
