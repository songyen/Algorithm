package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 홀수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<7;i++){
            int num = Integer.parseInt(br.readLine());
            if(num%2!=0) {
                sum+=num;
                min = min>num ? num : min;
            }
        }
        br.close();
        if(sum ==0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
