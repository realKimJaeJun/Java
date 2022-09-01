package step02;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt(); //주사위
		int d3 = sc.nextInt();
		
		// 모든 변수가 다른경우
		if(d1 != d2 && d2 != d3 && d1 != d3) {
			int res;
			if(d1 > d2) {
				if(d3 > d1) { // d3 > d1 > d2
					res = d3;
				}else {		  // d1 > (d2, d3)
					res = d1; 
				}
			}else {			  // d2 > d1
				if(d3 > d2) {
					res = d3; // d3 > d2 > d1
				}else {		  // d2 > (d1, d3)
					res = d2;
				}
			}
			System.out.println(res * 100);
		}
		// 2개는 같고 하나가 다른 경우
		else {
			if(d1 == d2 && d1 == d3) { // 셋 다 같은 경우
				System.out.println(10000 + d1 * 1000);
			}else {
				if(d1 == d2 || d1 == d3) {
					System.out.println(1000 + d1 * 100);
				}else {
					System.out.println(1000 + d2 * 100);
				}
			}
		}
	}
}
