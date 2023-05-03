import java.util.Scanner;

public class Input_03 {
    /**
     * 날짜 : 2023/05/03
     * 이름 : 김재준
     * 내용 : 자바 입력 실습하기 3
     */
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (Exception e) {
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}
