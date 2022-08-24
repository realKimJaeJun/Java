package ch04;

public class p114 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for( ; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 "+ sum + "입니다.");
		
		int num = 0;
		int m;
		for(m = 1; m < 11; m++) {
			num = m;
			System.out.println("안녕하세요"+num);
		}
	}
}
