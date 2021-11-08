package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = Integer.parseInt(br.readLine());
        int maxIdx = 1;
        for(int i=2;i<=9;i++){
            int num = Integer.parseInt(br.readLine());
            if(maxNum<num) {
                maxNum = num;
                maxIdx = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxIdx);
    }
}
