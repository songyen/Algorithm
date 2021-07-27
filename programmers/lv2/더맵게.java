package lv2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int result = 0;
        boolean flag = false;
        //조건 1. K 미만인 음식이 존재하는가?
        for(int i=0;i<scoville.length;i++){
            if(scoville[i]<K) flag=true;
        }

        //조건1 -> 존재하면 우선순위 큐에 추가, 아니라면 return 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//오름차순(최소힙)
            }
        });
        if(flag){
            for(int i:scoville){
                priorityQueue.offer(i);
            }
        }else return 0;

        //조건2. 음식이 1개인가?(조합하다보면 발생하기에)
        while(priorityQueue.size()>=2){
            //음식이 2개 이상이면, 조합한다
            priorityQueue.offer(priorityQueue.poll()+(priorityQueue.poll()*2));
            result++;
            //여전히 k 미만인 음식이 존재할 경우 loop 조건검사 반복, 아닐경우 return result(조합횟수)
            if(priorityQueue.peek()>=K){
                return result;
            }
        }
        //음식이 한 개 인 경우
        if(priorityQueue.size()==1 && priorityQueue.poll()<K) result = -1;
        return result;
    }
}
