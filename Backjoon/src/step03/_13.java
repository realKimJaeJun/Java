package step03;
/*
 * 날짜: 2022/09/16
 * 이름: 김재준
 * 내용: 백준 3단계 13번 문제. 더하기 사이클
 */
import java.util.Scanner;

public class _13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		int copy = N;
		
		while(true) {
			N = ((N%10) * 10) + (((N/10) + (N%10)) % 10);
			cnt++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
