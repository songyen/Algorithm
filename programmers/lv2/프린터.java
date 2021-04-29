package lv2;

import java.util.*;

public class 프린터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,1,3,2},2));
    }
    public static int solution(int[] priorities, int location) {
        LinkedList<Info> list = new LinkedList<>();
        int index = 0;
        for(int i : priorities){
            list.add(new Info(index++,i));
        }

        LinkedList<Info> deque = new LinkedList<>(list);
        List<Info> result = new ArrayList<>();
        int first = 0;
        int move = 1;
        ListIterator<Info> iterator = deque.listIterator();
        while(iterator.hasNext()){
            first = iterator.next().priority;
            if(first != Math.max(iterator.next().priority, first)){
                move++;
                Info lowerPriority = deque.removeFirst();
                deque.addLast(lowerPriority);
                for(int i=0;i<move;i++) {
                    iterator.previous();
                }
                break;
            }else{
                result.add(deque.removeFirst());
            }
        }

        int answer = 0;
        for(int i=0;i< result.size();i++){
            if(result.get(i).index == location){
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
