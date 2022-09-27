package step05;
/*
 * 날짜: 2022/09/27
 * 이름: 김재준
 * 내용: 백준 5단계 1번 문제. 정수 N개의 합
 */
public class _01 {
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
