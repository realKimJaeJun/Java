package step03;
/*
 * 날짜: 2022/09/15
 * 이름: 김재준
 * 내용: 백준 3단계 7번 문제. A+B - 8
 */
import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int x = 1; x <= T; x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + x + ": " + a + " + " + b + " = " + (a+b));
		}
		sc.close();
	}
}