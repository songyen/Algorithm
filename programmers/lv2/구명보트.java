package lv2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());//최대힙
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//최소힙
        for(int i : people){
            maxHeap.add(i);
            minHeap.add(i);
        }

        int answer = 0;
        while(maxHeap.size()!=0){
            if(maxHeap.peek()+minHeap.peek()<=limit) maxHeap.remove(minHeap.poll());
            minHeap.remove(maxHeap.poll());
            answer++;
        }
        return answer;
    }
}
