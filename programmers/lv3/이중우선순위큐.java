package lv3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        for(int i : solution(new String[]{"I 16","D 1"})){
            System.out.println(i);
        }
    }
    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> getMin = new PriorityQueue<>();
        PriorityQueue<Integer> getMax = new PriorityQueue<>(Comparator.reverseOrder());
        int num = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].startsWith("I")){
                num = Integer.parseInt(operations[i].split(" ")[1]);
                getMax.offer(num);
                getMin.offer(num);
            }else if(operations[i].equals("D 1") && !getMax.isEmpty()){//최대값 삭제
                getMin.remove(getMax.poll());
            }else{//최소값 삭제
                if(!getMin.isEmpty()) getMax.remove(getMin.poll());
            }
        }
        if(getMin.isEmpty() && getMax.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = getMax.poll();
            answer[1] = getMin.poll();
        }

        return answer;
    }
}
