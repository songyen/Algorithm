/*
 * source : BackJoon 1197번 [최소 스패닝 트리]
 */
package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MSTByPrim {
    public static class Edge implements Comparable<Edge>{
        int start, end, cost;

        public Edge(int start, int end, int cost){
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    static ArrayList<Edge>[] adj;//각 노드의 연결상태를 저장
    static boolean[] visit;//방문체크용 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());

        adj = new ArrayList[node+1];
        visit = new boolean[node+1];

        for(int i=1;i<=node;i++){//list 배열 초기화
            adj[i] = new ArrayList<>();
        }

        String[] inputStr;
        for(int i=0;i<edge;i++){
            inputStr = br.readLine().split(" ");
            int start = Integer.parseInt(inputStr[0]);
            int end = Integer.parseInt(inputStr[1]);
            int cost = Integer.parseInt(inputStr[2]);
            adj[start].add(new Edge(start, end, cost));
            adj[end].add(new Edge(start,end,cost));
        }

        br.close();
        System.out.println(MST());

    }

    public static int MST() {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();//우선순위큐는 Edge의 cost에 대한 최소힙으로 구현된다.
        Queue<Integer> queue = new LinkedList<>();//정점 모두 방문하는데 사용할 큐
        int answer = 0;

        queue.add(1);//1노드를 시작정점으로 잡음
        while(!queue.isEmpty()){
            //시작 정점 및 연결된 정점 방문처리
            int curNode = queue.poll();
            visit[curNode] = true;

            for(Edge edge : adj[curNode]){
                if(!visit[edge.end])
                    priorityQueue.add(edge);
            }

            //만약 이미 방문한 것 중 가장 작은 가중치가 나올 경우 한번 더 빼서 또 확인
            while(!priorityQueue.isEmpty()){
                Edge edge = priorityQueue.poll();
                if(!visit[edge.end]){
                    queue.add(edge.end);
                    visit[edge.end] = true;
                    answer += edge.cost;
                    break;
                }
            }
        }
        return answer;
    }
}
