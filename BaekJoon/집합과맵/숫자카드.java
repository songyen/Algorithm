package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //이분탐색을 위한 오름차순 정렬
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            int card = Integer.parseInt(st.nextToken());
            //이분탐색
            int start = 0;
            int end = n-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(card==arr[mid]) {
                    sb.append(1+" ");
                    break;
                }
                if(card>arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
                if(start>end){
                    sb.append(0+" ");
                    break;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
