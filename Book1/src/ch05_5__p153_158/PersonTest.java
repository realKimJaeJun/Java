package ch05_5__p153_158;
/*
 * 날짜: 2022/09/13
 * 이름: 김재준
 * 내용: 생성자 테스트
 */
public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		
		Person personLee = new Person("이순신", 175, 75);
	}
}
