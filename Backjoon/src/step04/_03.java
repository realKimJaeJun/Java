package step04;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 날짜: 2022/09/21
 * 이름: 김재준
 * 내용: 백준 4단계 3번 문제. 나머지
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i< 10; i++) {
			h.add(sc.nextInt()%42);
		}
		
		sc.close();
		System.out.println(h.size());
	}

}
