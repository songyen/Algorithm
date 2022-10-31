package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            System.out.println(getRoomNumber(H,N));
        }
    }

    public static int getRoomNumber(int H, int N){
        if(N%H==0){
            return (H*100)+(N/H);
        }else{
            return (N%H*100)+(N/H+1);
        }
    }
}
