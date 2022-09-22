package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜: 2022/09/21
 * 이름: 김재준
 * 내용: 백준 4단계 4번 문제. 평균
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double arr[] = new double[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		
		double sum= 0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.println(sum / arr.length);
	}
}
