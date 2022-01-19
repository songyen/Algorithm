package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최소비용구하기 {
    private static int min = Integer.MAX_VALUE;
    private static ArrayList<Bus>[] arr;
    private static boolean[] visited;
    private static int[] dis;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            arr[i] = new ArrayList<>();
        }
        visited = new boolean[N+1];
        dis = new int[N+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr[start].add(new Bus(end, cost));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        System.out.println(dijkstra(start, end));
        br.close();
    }

    public static int dijkstra(int start, int end){
        PriorityQueue<Bus> pq = new PriorityQueue<>();
        pq.offer(new Bus(start, 0));
        dis[start] = 0;

        while(!pq.isEmpty()){
            Bus bus = pq.poll();

            if(!visited[bus.end]){
                visited[bus.end] = true;

                for(Bus next : arr[bus.end]){
                    if(!visited[next.end] && dis[next.end]>dis[bus.end]+next.cost){
                        dis[next.end] = dis[bus.end]+next.cost;
                        pq.add(new Bus(next.end, dis[next.end]));
                    }
                }
            }
        }
        return dis[end];
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
