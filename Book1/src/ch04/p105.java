package ch04;
/*
 * 날짜: 2022/08/23
 * 이름: 김재준
 * 내용: switch-case문 예제 (2)
 */
public class p105 {
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		int floor = 5;
		
		switch(floor) {
		case 1:
			System.out.println("1층 약국입니다.");
			break;
		case 2:
			System.out.println("2층 정형외과입니다.");
			break;
		case 3:
			System.out.println("3층 피부과입니다.");
			break;
		case 4:
			System.out.println("4층 치과입니다.");
			break;
		default:
			System.out.println("5층 헬스 클럽입니다.");
		}
	}
}
