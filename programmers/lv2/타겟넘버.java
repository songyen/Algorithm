package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 타겟넘버 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,1,1}, 3));
    }
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(numbers[0]);
        for(int i=1;i<=numbers.length;i++){
            for(int j=0;j<Math.pow(2, i-1);j++){
                int plus = queue.poll();
                if(i==numbers.length){
                    if(plus==target) answer++;
                    if(plus-2==target) answer++;
                }else{
                    queue.add(plus + numbers[i]);
                    queue.add(plus - numbers[i]);
                }
            }
        }
        return answer;
    }
}
