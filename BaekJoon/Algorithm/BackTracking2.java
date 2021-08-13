/*
 * source : BackJoon 15650번 [N과 M(2)]
 */
package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTracking2 {
    private static int n,m;
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        bt(1, 0);
    }

    public static void bt(int start, int cnt){
        if(cnt == m){
            for(int i : arr) System.out.print(i+" ");
            System.out.println();
            return;
        }

        for(int i=start;i<=n;i++){
                arr[cnt] = i;
                bt(i+1, cnt+1);
        }
    }
}

