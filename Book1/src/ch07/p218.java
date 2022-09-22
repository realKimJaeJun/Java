package ch07;
/*
 * 날짜: 2022/09/22
 * 이름: 김재준
 * 내용: 향상된 for문 사용하기 
 */
public class p218 {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScrips", "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
		
		int[] numArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int num : numArray) {
			System.out.println(num);
		}
	}
}
