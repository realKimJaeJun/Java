package ch07;
/*
 * 날짜: 2022/09/21
 * 이름: 김재준
 * 내용: 배열의 유효한 요소 값 출력하기  
 */
public class p205 {
	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}
}
