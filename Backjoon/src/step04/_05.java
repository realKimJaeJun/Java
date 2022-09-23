package step04;

import java.util.Scanner;

/*
 * 날짜: 2022/09/23
 * 이름: 김재준
 * 내용: 백준 4단계 5번 문제. OX퀴즈
 */
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			
			int cnt = 0; // count - 연속횟수
			int sum = 0; // 누적합산
			
			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}
