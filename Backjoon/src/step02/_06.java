package step02;
/*
 * 날짜: 2022/08/29
 * 이름: 김재준
 * 내용: 백준 2단계 6번 문제. 오븐 시계
 */
import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = 60 * a + b;
		min += c;
		
		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour+ " " + minute);
		
		sc.close();
	}
}