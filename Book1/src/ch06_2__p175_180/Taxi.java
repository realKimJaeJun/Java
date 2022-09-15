package ch06_2__p175_180;
/*
 * 날짜: 2022/09/15
 * 이름: 김재준
 * 내용: 택시 클래스 구현하기
 */
public class Taxi {
	String taxiClass;
	int passengerCount;
	int money;
	
	public Taxi(String taxiClass) {
		this.taxiClass = taxiClass;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiClass + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
