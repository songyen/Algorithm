package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 연산자끼워넣기 {
    private static int[] num;
    private static int[] op;
    private static int n;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n];
        op = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            op[i] = Integer.parseInt(st.nextToken());
        }
        dfs(num[0],1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int sum, int idx) {
        //연산자를 모두 다 쓴 경우 결과값 return
        if(idx==n) {
           max = Math.max(sum,max);
           min = Math.min(sum,min);
           return;
        }

        for(int i=0;i<4;i++){
            if(op[i]>0){
                op[i]--;
                switch (i){
                    case 0 : dfs(sum+num[idx],idx+1); break;
                    case 1 : dfs(sum-num[idx],idx+1); break;
                    case 2 : dfs(sum*num[idx],idx+1); break;
                    case 3 :
                        if(sum/num[idx]<0) dfs(sum*(-1)/num[idx]*(-1),idx+1);
                        else dfs(sum/num[idx],idx+1);
                        break;
                }
                op[i]++;
            }
        }
    }
}
