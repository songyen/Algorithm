package 백트래킹;

import java.util.Scanner;

public class N과M_2 {
    private static int n,m;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        bfs(1,0);
    }

    private static void bfs(int start, int cnt) {
        if(cnt==m){
            for(int i : arr) System.out.print(i+" ");
            System.out.println();
            return;
        }
        for(int i=start;i<=n;i++){
            arr[cnt] = i;
            bfs(i+1,cnt+1);
        }

    }
}
