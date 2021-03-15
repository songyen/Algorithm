package lv1;

import java.util.Arrays;

public class 정수내림차순으로배치하기{
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
    public static long solution(long n) {
        String answer = "";
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr); //오름차순

        for(int i=arr.length-1;i>=0;i--){ //역순으로 꺼내옴
            answer += arr[i];
        }
        return Long.parseLong(answer);
    }

}
