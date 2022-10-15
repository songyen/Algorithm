package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for(int i=0;i<c;i++){
            System.out.println(String.format("%.3f",getRate(br.readLine()))+"%");
        }
        br.close();
    }

    private static float getRate(String param) {
        StringTokenizer st = new StringTokenizer(param);
        int n = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
        }
        float avg = sum/n;
        float s = 0;
        for(int i=0;i<n;i++){
            if(avg<array[i]) s++;
        }
        return s/n*100;
    }
}
