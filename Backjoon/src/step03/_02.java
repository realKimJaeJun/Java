package step03;
/*
 * 날짜: 2022/09/02
 * 이름: 김재준
 * 내용: 백준 3단계 2번 문제. A+B - 3 
 */
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int arr[] = new int[c];
		
		for(int i=0; i<c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		sc.close();
		
		for(int d:arr) {
			System.out.println(d);
		}
	}
}
