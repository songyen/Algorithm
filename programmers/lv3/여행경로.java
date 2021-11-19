package lv3;


import java.util.ArrayList;
import java.util.Collections;

public class 여행경로 {
    private boolean[] visited;
    private ArrayList<String> routes = new ArrayList<>();
    private String[][] flights;
    public String[] solution(String[][] tickets) {
        flights = tickets;
        visited = new boolean[flights.length+1];
        dfs("ICN","ICN",1);
        Collections.sort(routes);
        String[] answer = routes.get(0).split(" ");
        return answer;
    }

    public void dfs(String from, String route, int cnt){
        if(cnt==flights.length+1){
            routes.add(route);
            return;
        }
        for(int i=0;i<flights.length;i++){
            if(!visited[i] && flights[i][0].equals(from)){
                visited[i] = true;
                dfs(flights[i][1], route+" "+flights[i][1],cnt+1);
                visited[i] = false;
            }
        }
    }
}
