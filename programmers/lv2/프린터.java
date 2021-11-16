package lv2;

import java.util.*;

public class 프린터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,1,3,2},2));
    }
    public static int solution(int[] priorities, int location) {
        /* 211116 review
        Queue<Printer> queue = new LinkedList<>();
        PriorityQueue<Integer> priority = new PriorityQueue<>((o1,o2)->o2-o1);//중요도 최대힙
        for(int i=0;i<priorities.length;i++){
            queue.add(new Printer(priorities[i], i));
            priority.add(priorities[i]);
        }
        int answer = 0;
        while(!queue.isEmpty()){
            if(queue.peek().priority < priority.peek()){
                queue.add(queue.poll());
            }else{
                if(queue.peek().index == location) break;
                queue.poll();
                priority.poll();
                answer++;
            }
        }
        return answer+1;
         */
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
    /* 211116 review
    public static class Printer{
        private int priority;
        private int index;

        public Printer(int priority, int index){
            this.priority = priority;
            this.index = index;
        }
    }
    */
    static class Info{
        private int index;
        private int priority;

        public Info(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
