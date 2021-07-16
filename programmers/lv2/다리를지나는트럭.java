/*
* reference : https://jaebworld.tistory.com/42
 */

package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> truck = new LinkedList<>();
        int second = 0;
        int totalWeights = 0;

        for(int i=0;i<truck_weights.length;i++){
           //새로운 트럭이 진입못하는 경우, 진입할 수 있을 때까지 loop반복
           while(totalWeights+truck_weights[i] > weight || truck.size()+1 > bridge_length) {
               if(truck.size()==bridge_length){//다리가 꽉 차 있는 경우, 가장 먼저 진입한 트럭이 빠져나감
                   totalWeights -= truck.poll();
               }else{//다리에 진입해 있는 트럭만 지나갈 수 있도록, 0을 넣어준다.
                   truck.add(0);
                   second++;
               }
           }
           //새로운 트럭 진입할 수 있다
           truck.add(truck_weights[i]);
           totalWeights += truck_weights[i];
           second++;
        }

        return second+bridge_length;
    }

    @Test
    public void test(){
        Assert.assertEquals(8,solution(2,10,new int[]{7,4,5,6}));
    }
}
