package 그래프탐색.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr =  new int[10][10];
        for(int i=1;i<=9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = -1;
        int a = 0;
        int b = 0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(max<=arr[i][j]){
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(a+" "+b);
    }
}
