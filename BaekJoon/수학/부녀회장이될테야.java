package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부녀회장이될테야 {
    public static int[][] arr = new int[15][14];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<14;i++) {
            arr[i][0] = 1; //1호는 1명 거주
            arr[0][i] = i + 1; //0층 i호는 i명 거주
        }arr[14][0] = 1;
        for(int i=0;i<T;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            if(n==1) System.out.println(1);
            else if(k==0) System.out.println(n);
            else{
                getNum(k,n);
            }
        }
    }

    public static void getNum(int k, int n){
        for(int i=1;i<=k;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0) arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        System.out.println(arr[k][n-1]);
    }

}
