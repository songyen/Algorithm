package lv2;

import java.util.Deque;
import java.util.LinkedList;

public class 큰수만들기 {
    public static void main(String[] args) {
        System.out.println(solution("1924",2));
    }
    private static int removeK;
    public static String solution(String number, int k) {
        removeK = k;
        String answer = "";
        int start = getStartIndex(number);
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(Integer.parseInt(number.charAt(start)+""));
        for(int i=start+1;i<number.length();i++){
            int num = Integer.parseInt(number.charAt(i)+"");
            if(deque.peekLast() < num && removeK!=0) {
                deque.pollLast();
                removeK--;
            }
            deque.addLast(num);
        }

        for(int i : deque){
            answer+= String.valueOf(i);
        }
        return answer;
    }

    public static int getStartIndex(String number){
        int startIndex = 0;
        int max = Integer.parseInt(number.charAt(0)+"");//1
        for(int i=1;i<=removeK;i++){
            int nextNum = Integer.parseInt(number.charAt(i)+"");
            if(max < nextNum) {
                max = nextNum;
                startIndex = i;
            }
        }
        removeK-=startIndex;
        return startIndex;
    }
}
