package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(num -->0){
            int n = Integer.parseInt(st.nextToken());
            if(max < n) max = n;
            if(min > n) min = n;
        }
        System.out.println(max * min);
    }
}
