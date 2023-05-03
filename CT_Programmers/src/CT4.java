public class CT4 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
        CT4 ct4 = new CT4();
        System.out.println(ct4.solution(123));
        System.out.println(ct4.solution(987));
    }
}
