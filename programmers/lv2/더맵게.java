package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int result = 0;
        Arrays.sort(scoville);
        while(scoville[0] < K){
            if(scoville.length==1 && scoville[0] < K){
                result = -1;
            }
            result++;
            scoville = mixRecipe(scoville);
        }
        return result;
    }

    public int[] mixRecipe(int[] scoville){
        int[] mixed = new int[scoville.length-1];
        int newRecipe = 1 + (scoville[0] + scoville[1]);
        mixed[0] = newRecipe;
        for(int i=2;i<scoville.length;i++){
            mixed[i-1] = scoville[i];
        }
        Arrays.sort(mixed);
        return mixed;
    }

    @Test
    public void test(){
        int[] scoville = {1,2,3,9,10,12};
        Assert.assertEquals(2, solution(scoville, 7));
    }
}
