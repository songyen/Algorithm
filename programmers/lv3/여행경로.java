package lv3;

import java.util.Stack;

public class 여행경로 {
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        int index = 0;
        answer[index] = "ICN";
        boolean[] visited = new boolean[tickets.length];
        Stack<Integer> routes = new Stack<>();
        while(index!=tickets.length){
            for(int i=0;i<tickets.length;i++){
                if(!visited[i] && answer[index].equals(tickets[i][0]) ){
                    if(!routes.isEmpty() && (tickets[routes.peek()][1].compareTo(tickets[i][1])>0)) routes.pop();
                    routes.push(i);
                }
            }
            visited[routes.peek()] = true;
            answer[++index] = tickets[routes.pop()][1];
        }
        return answer;
    }
}
