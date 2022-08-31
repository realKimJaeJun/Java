package ch08;
/*
 * 날짜: 2022/08/31
 * 이름: 김재준
 * 내용: Customer 클래스 구현하기
 */
public class Customer {
	private int customerId; 			//고객 아이디
	private String customerName;		//고객 이름
	private String customerGrade;		//고객 등급
	int bonusPoint;						//보너스 포인트
	double bonusRatio;					//적립 비율
	
	public Customer() {
		customerGrade = "SILVER";		//기본등급
		bonusRatio = 0.01;				// 보너스 포인트 기본 적립 비율
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
}

