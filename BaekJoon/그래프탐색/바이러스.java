package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바이러스 {
    private static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        parent = new int[computer+1];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        int answer = -1;
        for(int i=0;i<parent.length;i++){
            if(find(parent[i])==1) answer++;
        }
        System.out.println(answer);
    }
    public static void union(int x, int y){
        x = find(x);
        y = find(y);
        if(x!=y){
            if(x<y) parent[y]=x;
            else parent[x]=y;
        }
    }
    public static int find(int x){
        if(x==parent[x]) return x;
        return parent[x] = find(parent[x]);
    }
}
