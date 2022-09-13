package ch05;
/*
 * 날짜: 2022/09/03
 * 이름: 김재준
 * 내용: Student 클래스에 main() 함수 추가하기
 */
public class p144 {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		p144 studentAhn = new p144(); //Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
