/*
 * source : BackJoon 15651번 [N과 M(3)]
 */
package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking3 {
    private static int n,m;
    private static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        bt(0);
        System.out.println(sb);
    }

    public static void bt(int cnt){
        if(cnt == m){
            for(int i : arr) sb.append(i+" ");
            sb.append('\n');
            return;
        }

        for(int i=1;i<=n;i++){
            arr[cnt] = i;
            bt(cnt+1);
        }
    }
}
