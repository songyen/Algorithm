package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            if(max<num){
                max = num;
                idx = i;
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(idx);
    }
}
