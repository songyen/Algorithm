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
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] len = new int[N];
        int end = 0;
        int sum = 0;
        for(int i=0;i<N;i++){
            if(i==0) sum = arr[i];
            else sum -= arr[i-1];
            if(sum>=S){
                len[i] = end-i+1;
                continue;
            }
            for(int j=end+1;j<N;j++){
                sum+= arr[j];
                if(sum>=S) {
                    end=j;
                    break;
                }
            }
            if(sum<S){
                len[i] = 0;
                break;
            }
            else len[i] = end-i+1;
        }

        int result = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(len[i]!=0 && len[i]<result) result = len[i];
            System.out.print(len[i]+" ");
        }
        System.out.println();
        if(result==Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(result);
    }
}
