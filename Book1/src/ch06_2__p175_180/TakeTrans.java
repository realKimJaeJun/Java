package ch06_2__p175_180;
/*
 * 날짜: 2022/09/15
 * 이름: 김재준
 * 내용: 버스와 지하철 타기
 */
public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 30000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi = new Taxi("모범택시");
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();
		
	}
}
