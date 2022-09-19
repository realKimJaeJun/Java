package step03;
/*
 * 날짜: 2022/09/02
 * 이름: 김재준
 * 내용: 백준 3단계 3번 문제. 합 
 */
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int res = 0;
		
		for(int i=0; i<=a; i++) {
			res += i;
		}sc.close();
		System.out.println(res);
	}
}
