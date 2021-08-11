package lv2;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = new Integer[citations.length];
        for(int i=0;i<citations.length;i++){
            arr[i] = citations[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0;i<citations.length;i++){
            if(citations[i] <=i+1) {
                answer = citations[i];
                break;
            }
        }
        return answer;
    }
}
