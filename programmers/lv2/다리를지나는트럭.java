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
        /*(211115 review)
        Queue<Integer> queue = new LinkedList<>();
        int idx = 0;
        queue.add(truck_weights[idx]);
        int totalWeight = truck_weights[idx];
        int second = 1;
        while(!queue.isEmpty() && idx <= truck_weights.length-2){
            if(queue.size()==bridge_length) {//다리에 최대 트럭 수가 올라가면, 가장 앞에 있는 트럭이 다리를 벗어남
                totalWeight -= queue.poll();
            }
            if(totalWeight+truck_weights[idx+1] <= weight){//최대 무게가 초과하지 않는다면, 새로운 트럭 진입한다
                totalWeight += truck_weights[++idx];
                queue.add(truck_weights[idx]);
            }else queue.add(0);//최대 무게가 초과된다면 다리에 진입해 있는 트럭만 지나갈 수 있도록 0을 넣어준다.
            second++;
        }
        return second+bridge_length;//마지막 트럭이 진입하는 순간, 다리길이만큼 second가 흐르면 모든 트럭이 다리를 건너게된다.
        */
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
