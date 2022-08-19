package sub2;

import java.util.Scanner;

public class Test {
	static void circleMath() {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter radius value");
		double radius=input.nextDouble();
		System.out.println("The area is "+ Math.PI * radius * radius);
		input.close();
	}
	public static void main(String[] args) {
		circleMath();
	}
}
