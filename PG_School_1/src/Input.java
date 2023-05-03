import java.util.Scanner;

/**
 * 날짜 : 2023/05/03
 * 이름 : 김재준
 * 내용 : 자바 입력 실습하기
 */
public class Input {
    public static void main(String[] args) {
        // 입력 객체 생성
        Scanner scanner;
        // 입력 객체 메모리에 로딩
        scanner = new Scanner(System.in);
        // 입력 받기
        String input = scanner.nextLine();
        // 입력 값 출력
        System.out.println(input);
    }
}
