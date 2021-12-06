package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빗물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] arr = new int[w];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        for(int i=1;i<arr.length-1;i++){
            int left=0;
            int right = 0;
            for(int j=0;j<i;j++){
                if(left<arr[j]) left = arr[j];
            }
            for(int k=i+1;k<arr.length;k++){
                if(right<arr[k]) right = arr[k];
            }
            int std = left<right?left:right;
            if(std-arr[i]>0) answer+=std-arr[i];
        }
        System.out.println(answer);
    }
}
