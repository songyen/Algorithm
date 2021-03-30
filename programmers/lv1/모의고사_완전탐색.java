package lv1;

import java.util.*;

public class 모의고사_완전탐색 {
    public static void main(String[] args) {
        int[] answer = solution(new int[]{1,2,3,4,5});
        for(int i : answer){
            System.out.println(i);
        }
    }
    public static int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int f = 0;
        int s = 0;
        int t = 0;

        for(int i=0;i<answers.length;i++){
            if(first[i%first.length] == answers[i]) f++;
            if(second[i%second.length] == answers[i]) s++;
            if(third[i%third.length] == answers[i]) t++;
        }

        List<Integer> list = new ArrayList<>();
        int max = Math.max(f,s);
        max = Math.max(max,t);

        if(f == max) list.add(1);
        if(s == max) list.add(2);
        if(t == max) list.add(3);

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
