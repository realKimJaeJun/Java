package step04;

import java.util.Scanner;

/*
 * 날짜: 2022/09/26
 * 이름: 김재준
 * 내용: 백준 4단계 6번 문제. 평균은 넘겠지
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		int testcase = sc.nextInt();
		
		for(int i =0; i<testcase; i++) {
			int N = sc.nextInt();
			arr = new int[N];
			
			double sum = 0;
			
			for(int j=0; j<N; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val;
			}
			
			double mean = (sum/N);
			double count = 0;
			
			for(int j=0; j<N; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
				System.out.printf("%.3f%%\n", (count/N) * 100);
		}
		sc.close();
	}
}
