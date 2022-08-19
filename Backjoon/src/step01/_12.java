package step01;
/*
 * 날짜: 2022/08/19
 * 이름: 김재준
 * 내용: 백준 1단계 12번 문제. 곱셈
 */
import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		sc.close();
		
		System.out.println(a*(b.charAt(2)-'2'));
		System.out.println(a*(b.charAt(1)-'1'));
		System.out.println(a*(b.charAt(0)-'0'));
		System.out.println(a* Integer.parseInt(b));
	}
}
