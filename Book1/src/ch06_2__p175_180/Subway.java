package ch06_2__p175_180;
/*
 * 날짜: 2022/09/15
 * 이름: 김재준
 * 내용: 지하철 클래스 구현하기
 */
public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
