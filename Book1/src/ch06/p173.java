package ch06;
/*
 * 날짜: 2022/09/14
 * 이름: 김재준
 * 내용: this를 사용하여 주소 값 반환하기
 */
class Person1 {
	String name;
	int age;
	
	Person1(){
		this("이름 없음", 1);
	}
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person1 returnItSelf() {
		return this; //this 반환
	}
}


public class p173 {
	public static void main(String[] args) {
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
	
		Person1 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
