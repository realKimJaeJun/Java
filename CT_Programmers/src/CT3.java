public class CT3 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }

    public static void main(String[] args) {
        CT3 ct3 = new CT3();
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 5};
        System.out.println(ct3.solution(arr1));
        System.out.println(ct3.solution(arr2));
    }
}
