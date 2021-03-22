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
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }

        int[] answer;
        if(count == 0) {
            answer = new int[]{-1};
        }
        else {
            answer = new int[count];
            int index = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] % divisor == 0){
                    answer[index++] = arr[i];
                }
            }
            Arrays.sort(answer);
        }

        return answer;
    }
}
