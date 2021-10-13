package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 타겟넘버 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int first = numbers[0];
        queue.add(first);
        for(int i=1;i<=numbers.length;i++){
            for(int j=0;j<Math.pow(2, i-1);j++){
                int plus = queue.poll();
                if(i==numbers.length){
                    if(plus==target) answer++;
                    if(plus+first*-2==target) answer++;
                }else{
                    queue.add(plus + numbers[i]);
                    queue.add(plus - numbers[i]);
                }
            }
        }
        return answer;
    }
}
