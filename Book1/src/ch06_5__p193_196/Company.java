package ch06_5__p193_196;
/*
 * 날짜: 2022/09/20
 * 이름: 김재준
 * 내용: public 메서드 만들긴
 */
public class Company {
	private static Company instance = new Company();
	public static Company getInstance() {
	if(instance == null) {
		instance = new Company();
	}
	return instance;
	}
}
