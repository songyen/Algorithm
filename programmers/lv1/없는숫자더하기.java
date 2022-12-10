package lv1;

import java.util.Arrays;

public class 없는숫자더하기 {
    public static void main(String[] args)  {
        int[] numbers = {1,2,3,4,5,6,7,8,0};
        int answer = 0;
        int idx = 0;
        Arrays.sort(numbers);
        for(int i=0;i<10;i++){
            if(numbers[idx]!=i){
                answer+=i;
            }else{if(idx<numbers.length-1)idx++;}
        }
    }
}
