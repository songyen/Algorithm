/*
*reference : https://2ssue.github.io/algorithm/programmers_42578/
 */

package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class 위장 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();//map(의상종류, 의상개수)
        for(String[] arr : clothes){
            map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
        }

        int answer = 1;
        for(String keys : map.keySet()){
            answer *= map.get(keys)+1;
        }
        return answer-1;
    }

    @Test
    public void test(){
        Assert.assertEquals(5, solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    }
}
