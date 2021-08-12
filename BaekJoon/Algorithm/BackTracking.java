/*
 * reference : https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-15649%EB%B2%88-N%EA%B3%BC-M1-%EC%9E%90%EB%B0%94Java
 * source : BackJoon 15649 [N과 M(1)]
 */
package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking {
    private static int n,m;
    private static int[] arr;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visited = new boolean[n+1];
        bt(0);
    }

    public static void bt(int cnt){
        if(cnt == m){
            for(int i : arr) System.out.print(i+" ");
            System.out.println();
            return;
        }

        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i] = true;
                arr[cnt] = i;
                bt(cnt+1);
                visited[i] = false;
            }
        }
    }
}
