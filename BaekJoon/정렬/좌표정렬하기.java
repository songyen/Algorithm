package 정렬;

import java.util.*;
import java.io.*;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //람다 사용
        Arrays.sort(arr, (int[] o1, int[] o2)->{
            if(o1[0]==o2[0]){
                return o1[1]-o2[1];
            }else return o1[0]-o2[0];
        });
        for(int i=0;i<n;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
