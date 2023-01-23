package 백트래킹;

import java.util.Scanner;

public class N과M_1 {
    private static int n,m;
    private static int[] arr;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        visited = new boolean[n+1];
        dfs(0);
    }

    private static void dfs(int cnt) {
        if(cnt==m){
            for(int i : arr) System.out.print(i+" ");
            System.out.println();
            return;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i] = true;
                arr[cnt] = i;
                dfs(cnt+1);
                visited[i] = false;
            }
        }
    }
}
