package step05;

import java.util.Scanner;

/*
 * 날짜: 2022/09/28
 * 이름: 김재준
 * 내용: 백준 5단계 3번 문제. 한수
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print(Arithmetic_sequence(sc.nextInt()));
		sc.close();
	}

	private static int Arithmetic_sequence(int num) {
		int cnt = 0;
		
		if(num < 100) {
			return num;
		}else {
			cnt = 99;
			
			for(int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
