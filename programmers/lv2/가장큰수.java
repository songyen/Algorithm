/*
* reference : https://ivory-room.tistory.com/43
 */
package lv2;

import java.util.Arrays;

public class 가장큰수 {
    public String solution(int[] numbers) {
        String[] numToStr = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numToStr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(numToStr, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        StringBuilder str = new StringBuilder();
        if(numToStr[0].equals("0")) return "0";
        else{
            for(int i=0;i<numToStr.length;i++){
                str.append(numToStr[i]);
            }
        }
        return str.toString();
    }
}
