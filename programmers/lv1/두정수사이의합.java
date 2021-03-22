package lv1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        long A = (long) Math.min(a,b);
        long B = (long) Math.max(a,b);

        if(A == B) answer = A;
        else {
            for(long i=A;i<=B;i++){
                answer += i;
            }
        }
        return answer;
    }
}
