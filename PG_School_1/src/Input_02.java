import java.util.Scanner;

public class Input_02 {
    /**
     * 날짜 : 2023/05/03
     * 이름 : 김재준
     * 내용 : 자바 입력 실습하기 2
     */
    public static void main(String[] args) {
        // 입력 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 입력 받기
        String input = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        String input4 = scanner.next();

        // 입력 값 출력
        System.out.println(input);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);
    }
}
