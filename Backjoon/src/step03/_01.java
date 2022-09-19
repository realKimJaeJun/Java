package step03;
/*
 * 날짜: 2022/09/02
 * 이름: 김재준
 * 내용: 백준 3단계 1번 문제. 구구단
 */
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
	
			for(int i=1; i<10; i++) {
				System.out.println(a + " * " + i + " = " + a*i);
			}
			System.out.println();
	}
}
