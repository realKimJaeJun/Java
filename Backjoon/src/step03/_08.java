package step03;
/*
 * 날짜: 2022/09/15
 * 이름: 김재준
 * 내용: 백준 3단계 8번 문제. 별 찍기 - 1 
 */
import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}sc.close();
	}
}
