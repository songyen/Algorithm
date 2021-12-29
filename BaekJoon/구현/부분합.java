package 구현;

import java.io.*;
import java.util.*;

public class 부분합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(start <= N && end <= N) {
            if(sum >= S && min > end - start) min = end - start;

            if(sum < S) sum += arr[end++];
            else sum -= arr[start++];
        }

        if(min==Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(min);
    }
}
