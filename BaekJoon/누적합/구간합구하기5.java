package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        //누적합 2차원 배열 입력
        int[][] arr = new int[n+1][n+1];
        int[][] s = new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<n+1;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(j==1){
                    s[i][j] = s[i-1][n]+arr[i][j];
                }else s[i][j] = s[i][j-1] + arr[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = 0;
            if(y2==1) result = s[x2][y2]-s[x1-1][n];
            else result = s[x2][y2]-s[x1][y1-1];

            if(y1!=y2) {
                for(int i=1;i<=y1-1;i++) result-=arr[x2][i];
            }
            sb.append(result+"\n");
        }
        System.out.println(sb.toString().trim());
    }
}
