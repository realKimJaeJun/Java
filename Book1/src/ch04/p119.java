package ch04;
/*
 *날짜: 2022/08/24
 *이름: 김재준
 *내용: continue문 예제
 */
public class p119 {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)
				continue;
			total += num;
		}
		System.out.println("1부터 100까지 홀수의 합은 : " + total + "입니다.");
		
		for(num = 1; num <= 100; num++) {
			if(num % 3 != 0)
				continue;
			System.out.println(num); // 1부터 100까지 3의 배수 출력
		}
	}
}
