package step03;
/*
 * 날짜: 2022/09/16
 * 이름: 김재준
 * 내용: 백준 3단계 12번 문제. A+B - 4 
 */
import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		sc.close();
	}
}
