public class CT1 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0)
            answer = "Even";
        else answer = "Odd";
        return answer;
    }

    public static void main(String[] args) {
        CT1 ct1 = new CT1();
        System.out.println(ct1.solution(3));
        System.out.println(ct1.solution(4));
    }
}
