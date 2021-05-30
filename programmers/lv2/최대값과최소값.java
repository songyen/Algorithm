package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class 최대값과최소값 {
    public String solution(String s) {
        String answer = "";
        String[] arr;
        arr = s.split("[\\s]");


        int[] array = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            array[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(array);
        for(int a : array){
            System.out.println(a);
        }
        answer = array[0] + " " + array[array.length-1];

        return answer;
    }

    @Test
    public void test(){
        Assert.assertEquals("-4 -1",solution("-1 -2 -3 -4"));
    }
}
