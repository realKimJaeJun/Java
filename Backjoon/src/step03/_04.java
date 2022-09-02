package step03;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int p[][] = new int [N][2];
		
		int comp = 0;
		for(int i=0; i<p.length; i++) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
			comp += p[i][0] * p[i][1];
		}sc.close();
		if (X == comp) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
