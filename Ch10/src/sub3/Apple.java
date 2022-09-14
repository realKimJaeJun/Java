package sub3;

import java.io.Serializable;

public class Apple implements Serializable{

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	
	public void show() {
		// 객체 정보 조회
		System.out.println("객체번호 : " + hashCode()); //객체의 식별번호 (해시값)
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}
