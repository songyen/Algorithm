package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class N개의최소공배수 {
    public int solution(int[] arr){
        Arrays.sort(arr);

        //나눠지는게 없을 때까지 구하는 거야
        int divisor;
        int divisorIndex;
        int result = 1;
        while(true){
            divisorIndex = findDivisor(arr);
            if(divisorIndex == -1) break;
            else{
                divisor = arr[divisorIndex];
                result *= divisor;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]%divisor != 0) arr[i] = arr[i];
                    else arr[i] /= divisor;
                }
            }
        }

        //나눠지는 없으면 이제 곱하기
        for(int i=0;i<arr.length;i++){
            result *= arr[i];
        }
        return result;
    }

    private int findDivisor(int[] arr) {
        int divisor;
        int divisorIndex = 0;
        Loop1:
        for(int i=0;i<arr.length;i++){
            divisor = arr[i];
            if(divisor == 1) continue;
            if(i == arr.length-1) {
                divisorIndex = -1;
                break;
            }

            Loop2:
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]%divisor == 0){
                    //나눠지는게 하나라도 있는지 확인 있으면 return divisor인덱스
                    divisorIndex =  i;
                    break Loop1;
                }
            }
        }
        return divisorIndex;
    }

    @Test
    public void test(){
        Assert.assertEquals(168, solution(new int[]{2, 6, 8, 14}));
        Assert.assertEquals(6, solution(new int[]{1,2,3}));
    }
}
