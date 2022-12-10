package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //카운팅 배열
        int[] count = new int[100001];
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            count[input]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                while(count[i]-->0){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
