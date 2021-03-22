package lv1;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{5, 9, 7, 10},5);
        for(int i : answer){
            System.out.print(i+" ");
        }
    }
    public static int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(e -> e % divisor == 0).toArray();
    }
}
