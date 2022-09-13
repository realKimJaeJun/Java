package ch05_5__p153_158;
/*
 * 날짜: 2022/09/13
 * 이름: 김재준
 * 내용: 생성자
 */
public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
