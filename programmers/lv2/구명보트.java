package lv2;

import java.util.*;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        Deque<Integer> desc = new LinkedList<>();
        Arrays.sort(people);
        for(int i= people.length-1;i>=0;i--){
            desc.add(people[i]);
        }

        int answer = 0;
        while(desc.size()!=0){
            if(desc.peekFirst()+desc.peekLast()<=limit) desc.pollLast();
            desc.pollFirst();
            answer++;
        }
        return answer;
        /*배열로만 구현 가능(더 효율적인 코드)
        int answer = 0;
        Arrays.sort(people);
        int min = 0;
        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }
        return answer;
         */
    }
}
