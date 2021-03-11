package lv1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static long solution(long n) {
        long answer = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(Math.pow(i,2) == n) return answer = (long)Math.pow(i+1,2);
        }
        return answer = -1;
    }
}
