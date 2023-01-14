package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = n-1;
            int cnt = 0;
            while(start<=end){
                int mid = (start+end)/2;
                if(num==arr[mid]) cnt = map.get(num);
                if(num<arr[mid]) end = mid-1;
                else start = mid+1;
            }
            sb.append(cnt+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
