package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 줄세우기 {
    private static int[] indegree;
    private static ArrayList<Integer>[] list;
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        indegree = new int[N+1];
        list = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            indegree[to]++;
            list[from].add(to);
        }
        br.close();
        topologicalSort();
    }

    public static void topologicalSort(){
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for(int i=1;i<=N;i++){
            if(indegree[i]==0) queue.add(i);
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            result.append(node+" ");

            for(int nextNode : list[node]) {
                indegree[nextNode]--;
                if (indegree[nextNode] == 0){
                    queue.add(nextNode);
                }
            }
        }
        System.out.println(result.toString().trim());
    }
}
