package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(k==1) {
                max = Math.max(arr[i],max);
            }
            if(k==n){
                sum+=arr[i];
            }
        }
        if(k==1){
            System.out.println(max);
            System.exit(0);
        }else if(k==n){
            System.out.println(sum);
            System.exit(0);
        }else{
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(i==k-1){
                    max = Math.max(sum,max);
                }else if(i>=k){
                    sum-=arr[i-k];
                    max = Math.max(sum,max);
                }
            }
            System.out.println(max);
        }
    }
}
