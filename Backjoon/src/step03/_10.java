package step03;
/*
 * 날짜: 2022/09/16
 * 이름: 김재준
 * 내용: 백준 3단계 10번 문제. X보다 작은 수 
 */
import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0; i<N; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
