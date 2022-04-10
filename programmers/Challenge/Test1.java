/*
* KaKao InternShip CodingTest Test1 [문자열문제]
 */
package Challenge;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Test1.solution(4, new int[][]{{2,3},{0,1},{1,2}}));
    }
    private static int[] parent;
    public static long solution(int n, int[][] edges) {
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        for(int i=0;i<edges.length;i++){
            parent[edges[i][1]] = edges[i][0];
        }
        long answer = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i){
                    int itoJ = find(i,j); //distance(i,j)
                    for(int k=0;k<n;k++){
                        if(k!=i && k!=j){
                            int jtoK = find(j,k); //distance(j,k)
                            int itoK = find(i,k); //distance(i,k)
                            if(itoJ + jtoK != itoK) continue;
                            else{
                                answer++;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
    public static int find(int x, int y){
        int cnt = 1;
        while(parent[y]!=x){
            if(parent[y]==y) break;
            y = parent[y];
            cnt++;
        }
        if(parent[y]==y){
            find(y,x);
        }
        return cnt;
    }
}
