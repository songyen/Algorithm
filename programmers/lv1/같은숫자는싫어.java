package lv1;

import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        for(int i: solution(new int[]{1,1,3,3,0,1,1}));
    }
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int num = arr[0];
        list.add(num);
        for(int i=1;i<arr.length;i++){
            if(num != arr[i]){
                list.add(arr[i]);
                num = arr[i];
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
