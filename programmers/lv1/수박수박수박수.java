package lv1;

public class 수박수박수박수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    public static String solution(int n) {
        String answer = "";
        String[] arr = {"수","박"};

        for(int i=0;i<n;i++){
            answer += arr[i%2];
        }
        return answer;
    }
}
