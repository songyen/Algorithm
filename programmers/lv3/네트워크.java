package lv3;

import java.util.HashSet;

public class 네트워크 {
    private int[] parent;
    public int solution(int n, int[][] computers) {
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(computers[i][j]==1){
                    union(i,j);
                }
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(find(parent[i]));
        }
        return set.size();
    }

    public int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public void union(int i, int j){
        i = find(i);
        j = find(j);
        if(i!=j){
            if(i>j){
                parent[i] = j;
            }else parent[j] = i;
        }
    }
}
