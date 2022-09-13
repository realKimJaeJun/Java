package ch06;
/*
 * 날짜: 2022/09/13
 * 이름: 김재준
 * 내용: this 출력하기
 */
class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}
}


public class p170 {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}
