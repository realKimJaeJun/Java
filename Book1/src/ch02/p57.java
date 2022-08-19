package ch02;
/*
 * 날짜: 2022/08/18
 * 이름: 김재준
 * 내용: 실수형 연습
 */
public class p57 {
	public static void main(String[] args) {
		double dnum=3.14;
		float fnum=3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// 부동 소수점 방식의 오류
		double cnum=1;
		for(int i=0; i<10000; i++) {
			cnum=cnum+0.1;
			//cnum에 cnum+0.1을 더하는 걸 i명령문인 1만번 반복
		}
		System.out.println(cnum);
	}
}
