package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n*2-1;i++){
            if(i<=n){
                for(int j=1;j<=n-i;j++) sb.append(" ");
                for(int j=0;j<i*2-1;j++) sb.append("*");
            }else{
                for(int j=1;j<=i-n;j++) sb.append(" ");
                for(int j=0;j<(n*2-i)*2-1;j++) sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
