package step03;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int x = 1; x <= T; x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + x + ": " + a + " + " + b + " = " + (a+b));
		}
		sc.close();
	}
}