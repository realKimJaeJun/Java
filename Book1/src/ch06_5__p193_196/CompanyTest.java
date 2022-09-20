package ch06_5__p193_196;
/*
 * 날짜: 2022/09/20
 * 이름: 김재준
 * 내용: 변수의 주소 값 비교하기 
 */
public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1= Company.getInstance();
		Company myCompany2= Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}
}
