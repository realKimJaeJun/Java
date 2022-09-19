package step04;
/*
 * 날짜: 2022/09/19
 * 이름: 김재준
 * 내용: 백준 4단계 1번 문제. 최소, 최대
 */
import java.util.Arrays;
import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr); // 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드
		System.out.print(arr[0] + " " + arr[N-1]);
	}
}
