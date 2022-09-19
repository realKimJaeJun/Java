package step03;
/*
 * 날짜: 2022/09/14
 * 이름: 김재준
 * 내용: 백준 3단계 6번 문제. A+B - 7
 */
import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (a+b));
		}
		sc.close();
	}
}
