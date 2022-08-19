package ch02;
/*
 * 날짜: 2022/08/18
 * 이름: 김재준
 * 내용: 명시적 형 변환
 */
public class p68 {
	public static void main(String[] args) {
		double dNum1=1.2;
		float fNum2=0.9f;
		
		int iNum3=(int)dNum1+(int)fNum2;
		int iNum4=(int)(dNum1+fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		// 9,10 행의 결과가 다른 이유는
		// 12행의 결과는 변환된 두 값을 합한 값이 나온 것이고
		// 13행의 결과는 두 값을 합한 후 변환된 값이 나온 것이다.
	}
}
