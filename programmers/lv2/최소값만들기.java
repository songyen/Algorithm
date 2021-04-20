package lv2;

import java.util.*;

public class 최소값만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2}, new int[]{5,4,4}));
    }
    public static int solution(int []A, int []B){
        Arrays.sort(A);
        Integer[] b = new Integer[B.length];
        for(int i=0;i<B.length;i++){
            b[i] = (Integer) B[i];
        }
        Arrays.sort(b, (o1, o2) -> o2-o1);

        int minSum = 0;
        for(int i=0;i<A.length;i++){
            minSum += A[i] * b[i];
        }
        return minSum;
    }
}
