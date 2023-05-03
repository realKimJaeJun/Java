public class CT2 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        CT2 ct2 = new CT2();
        System.out.println(ct2.solution(12));
        System.out.println(ct2.solution(5));
    }
}
