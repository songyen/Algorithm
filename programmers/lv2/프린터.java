package lv2;

import java.util.*;

public class 프린터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,1,3,2},2));
    }
    public static int solution(int[] priorities, int location) {
        Queue<Info> pool = new LinkedList<>();
        int index = 0;
        for(int i : priorities){
            pool.add(new Info(index++,i));
        }

        List<Info> printed = new LinkedList<>();
        int first;
        boolean flag;
        while(!pool.isEmpty()){
            flag = false;
            first = pool.peek().priority;
            for(Info i : pool){
                if(first < i.priority){
                    flag = true;
                }
            }

            if(flag){
                pool.add(pool.poll());
            }else{
                printed.add(pool.poll());
            }
        }

        int answer = 0;
        for(int i=0;i< printed.size();i++){
            if(printed.get(i).index == location){
                answer = i+1;
            }
        }

        return answer;
    }

    static class Info{
        private int index;
        private int priority;

        public Info(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
