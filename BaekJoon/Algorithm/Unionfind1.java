/*
 * source : BackJoon 1717번 [집합의 표현]
 */
package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Unionfind1 {
    static int[] parent;
    static int[] rank;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        rank = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i] = i;
            rank[i] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(cmd == 0){
                union(a,b);
            }else if(cmd == 1){
                if(a==b) {
                    sb.append("YES"+"\n");
                    continue;
                }
                if(find(a)!=find(b)) sb.append("NO"+"\n");
                else sb.append("YES"+"\n");
            }else continue;
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int find(int x){
        if(x==parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y){
        x = find(x);
        y = find(y);
        if(x!=y){
            if(x<y) parent[y] = x;
            else parent[x] = y;
        }
    }
}
