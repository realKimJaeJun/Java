package step02;
/*
 * 날짜: 2022/08/26
 * 이름: 김재준
 * 내용: 백준 2단계 1번 문제. 두 수 비교하기
 */
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
			sc.close();
		}
	}
}
