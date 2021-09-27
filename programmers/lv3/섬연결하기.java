/*
* Algorithm : Kruskal, Union find, Greedy
 */
package lv3;

import java.util.*;

public class 섬연결하기 {
    public static class Edge implements Comparable<섬연결하기.Edge>{
        int start,end,cost;
        public Edge(int start, int end, int cost){
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;//가중치 기준 min heap 용
        }
    }

    private static int parent[];
    public int solution(int n, int[][] costs) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        parent = new int[n];
        for(int i=0;i<n;i++){//union find(init)
            parent[i] = i;
        }

        for(int i=0;i<costs.length;i++){
            priorityQueue.add(new Edge(costs[i][0], costs[i][1], costs[i][2]));
        }

        int cost = 0;
        for(int i=0;i<costs.length;i++){
            Edge edge = priorityQueue.poll();//가중치 가장 작은 간선 poll
            //두 노드의 루트노드 find
            int a = find(edge.start);
            int b = find(edge.end);
            if(a==b) continue;//cycle 생성시 간선선택 No
            else{//간선 선택 후, MST집합에 추가
                cost += edge.cost;
                parent[b] = a;//union
            }
        }
        return cost;
    }


    private int find(int x) {
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }
}
