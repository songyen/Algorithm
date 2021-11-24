package 구현;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N번째큰수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<10;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            bw.write(arr[7]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
