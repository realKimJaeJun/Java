public class StringExample {
    /*
    날짜 : 2023/05/03
    이름 : 김재준
    내용 : 자바 문자열 실습하기
     */
    public static void main(String[] args) {
        String chicken = "치킨은 살 안 쪄요.";
        String me = "살은 내가 쪄요.";
        System.out.println(chicken);
        System.out.println(me);
        System.out.println("----------------------------------");

        // 문자열 길이 구하기
        System.out.println("문자열 길이 구하기");
        int length = me.length();
        System.out.println(me.length());
        System.out.println(length);
        System.out.println("----------------------------------");

        // 문자열 바꾸기
        System.out.println("문자열 바꾸기");
        String replaced = me.replaceAll("내가", "치킨이");
        System.out.println(replaced);
        System.out.println("----------------------------------");

        // 문자열 더하기
        System.out.println("문자열 더하기");
        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);
        System.out.println("----------------------------------");

        // 문자열 자르기
        System.out.println("문자열 자르기");
        String birthDay = "1970/01/01";
        String year = birthDay.substring(0, 4);
        String day = birthDay.substring(8);
        System.out.println(year);
        System.out.println(day);
        System.out.println("----------------------------------");
    }
}
