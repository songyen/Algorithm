package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MSTByKruskal {
    public static class Edge implements Comparable<MSTByKruskal.Edge>{
        int start, end, cost;

        public Edge(int start, int end, int cost){
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;//min Heap용
        }
    }

    private static int node, edge;
    private static int[] parent;//union find(cycle 생성여부)에서 필요한 부모노드를 저장하는 배열
    private static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        parent = new int[node+1];
        visit = new boolean[node+1];

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        String[] inputStr;
        for(int i=0;i<edge;i++){
            inputStr = br.readLine().split(" ");
            priorityQueue.add(new Edge(Integer.parseInt(inputStr[0]), Integer.parseInt(inputStr[1]), Integer.parseInt(inputStr[2]))); //STEP 1. 간선의 가중치를 오름차순으로 정렬한다.
        }

        for(int i=1;i<=node;i++) parent[i] = i;//union find(init연산)

        int result = 0;
        for(int i=0;i<edge;i++){
            Edge edge = priorityQueue.poll();//현재 우선순위큐에 있는 edge중 간선 가중치가 가장 작은 것이 poll된다.
            //양쪽 노드의 루트노드가 같은지 확인하고
            int a = find(edge.start);
            int b = find(edge.end);
            if(a==b) continue;//같다면, cycle이 생성되기에 선택하지 않고 넘어간다.
            result += edge.cost;//다르다면, STEP2. cycle이 생성되지 않기에 간선을 선택한다.
            union(a,b);//STEP3. 선택한 간선을 MST 그룹에 추가해준다
        }
        System.out.println(result);
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a==b) return;
        else parent[b] = a;
    }

    private static int find(int x) {
        if(x==parent[x]) return x;
        return parent[x] = find(parent[x]);
    }
}
