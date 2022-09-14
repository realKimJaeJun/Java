package ch06;
/*
 * 날짜: 2022/09/14
 * 이름: 김재준
 * 내용: this로 다른 생성자 호출하기
 */
class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}


public class p172 {
	public static void main(String[] args) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);	}
}
