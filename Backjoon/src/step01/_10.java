package step01;

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
