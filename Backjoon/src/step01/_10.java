package step01;
/*
 * 날짜: 2022/08/19
 * 이름: 김재준
 * 내용: 백준 1단계 10번 문제. 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comp[] = {1, 1, 2, 2, 2, 8 };
		int input[] = new int[6];
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
			System.out.print(comp[i] - input[i] + " ");
		}
		sc.close();
	}
}
