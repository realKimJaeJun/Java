package step02;
/*
 * 날짜: 2022/08/26
 * 이름: 김재준
 * 내용: 백준 2단계 3번 문제. 윤년
 */
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		sc.close();
		}
	}
}
