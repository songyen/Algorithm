package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 최소비용구하기 {
    private static int min = Integer.MAX_VALUE;
    private static int end;
    private static ArrayList<Bus>[] arr;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            arr[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr[start].add(new Bus(end, cost));
        }
//        for(int i=1;i<=N;i++){
//            if(!arr[i].isEmpty()) Collections.sort(arr[i]);
//        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        visited[start] = true;
        dfs(start, 0);
        long end = System.currentTimeMillis();
        System.out.println("실행시간: "+(end-startTime)/1000.0);
        System.out.println(min);
    }

    public static void dfs(int start, int cost){
        if(start==end) {
            min = Math.min(min, cost);
            return;
        }

        for(Bus bus : arr[start]){
            if(min<=cost+bus.cost) continue;
            if(!visited[bus.end]){
                visited[end] = true;
                dfs(bus.end, cost+bus.cost);
                visited[end] = false;
            }
        }
    }

    public static class Bus implements Comparable<Bus> {
        private int end;
        private int cost;

        public Bus(int end, int cost){
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Bus o) {
            return this.cost - o.cost;
        }
    }
}
