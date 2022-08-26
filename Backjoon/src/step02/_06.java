package step02;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		if((b+c)>=60) {
			a++;
			b=(b+c)-60;
			if(b>=60) {
				a++;
				b=0+(60+(60-(b+c)));
				if(a==24){
					a++;
					a=0;
				}
			}
			System.out.println(a+" "+b);
		}
		else {
			System.out.println(a+" "+(b+c));
		}
		
		
 }
}