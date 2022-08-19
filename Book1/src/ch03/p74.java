package ch03;
/*
 * 날짜: 2022/08/18
 * 이름: 김재준
 * 내용: 산술 연산자를 사용하여 총점과 평균 구하기
 */
public class p74 {
	 public static void main(String[] args) {
		 int mathScore = 90;
		 int engScore = 70;
		 // 수학점수와 영어점수
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		// 총점 = 수학 + 영어
		double avgScore = totalScore / 2;
		System.out.println(avgScore);
		// 평균점 = 총점 / 2
		
		int korScore = 80;
		int totalScore2 = totalScore+korScore;
		double avgScore2 = totalScore2 / 3;
		System.out.println(totalScore2 +"\r"+ avgScore2);
		// "\r 또는 \n 개행문자"
	}
}
